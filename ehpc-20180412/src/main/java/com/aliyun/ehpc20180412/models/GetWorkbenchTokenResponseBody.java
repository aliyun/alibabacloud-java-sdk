// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetWorkbenchTokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("root")
    public GetWorkbenchTokenResponseBodyRoot root;

    public static GetWorkbenchTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkbenchTokenResponseBody self = new GetWorkbenchTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkbenchTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkbenchTokenResponseBody setRoot(GetWorkbenchTokenResponseBodyRoot root) {
        this.root = root;
        return this;
    }
    public GetWorkbenchTokenResponseBodyRoot getRoot() {
        return this.root;
    }

    public static class GetWorkbenchTokenResponseBodyRootInstanceLoginView extends TeaModel {
        @NameInMap("defaultViewUrl")
        public String defaultViewUrl;

        @NameInMap("rdpViewUrl")
        public String rdpViewUrl;

        @NameInMap("baseViewUrl")
        public String baseViewUrl;

        @NameInMap("fileTreeViewUrl")
        public String fileTreeViewUrl;

        @NameInMap("terminalViewUrl")
        public String terminalViewUrl;

        @NameInMap("viewName")
        public String viewName;

        public static GetWorkbenchTokenResponseBodyRootInstanceLoginView build(java.util.Map<String, ?> map) throws Exception {
            GetWorkbenchTokenResponseBodyRootInstanceLoginView self = new GetWorkbenchTokenResponseBodyRootInstanceLoginView();
            return TeaModel.build(map, self);
        }

        public GetWorkbenchTokenResponseBodyRootInstanceLoginView setDefaultViewUrl(String defaultViewUrl) {
            this.defaultViewUrl = defaultViewUrl;
            return this;
        }
        public String getDefaultViewUrl() {
            return this.defaultViewUrl;
        }

        public GetWorkbenchTokenResponseBodyRootInstanceLoginView setRdpViewUrl(String rdpViewUrl) {
            this.rdpViewUrl = rdpViewUrl;
            return this;
        }
        public String getRdpViewUrl() {
            return this.rdpViewUrl;
        }

        public GetWorkbenchTokenResponseBodyRootInstanceLoginView setBaseViewUrl(String baseViewUrl) {
            this.baseViewUrl = baseViewUrl;
            return this;
        }
        public String getBaseViewUrl() {
            return this.baseViewUrl;
        }

        public GetWorkbenchTokenResponseBodyRootInstanceLoginView setFileTreeViewUrl(String fileTreeViewUrl) {
            this.fileTreeViewUrl = fileTreeViewUrl;
            return this;
        }
        public String getFileTreeViewUrl() {
            return this.fileTreeViewUrl;
        }

        public GetWorkbenchTokenResponseBodyRootInstanceLoginView setTerminalViewUrl(String terminalViewUrl) {
            this.terminalViewUrl = terminalViewUrl;
            return this;
        }
        public String getTerminalViewUrl() {
            return this.terminalViewUrl;
        }

        public GetWorkbenchTokenResponseBodyRootInstanceLoginView setViewName(String viewName) {
            this.viewName = viewName;
            return this;
        }
        public String getViewName() {
            return this.viewName;
        }

    }

    public static class GetWorkbenchTokenResponseBodyRoot extends TeaModel {
        @NameInMap("instanceLoginView")
        public GetWorkbenchTokenResponseBodyRootInstanceLoginView instanceLoginView;

        public static GetWorkbenchTokenResponseBodyRoot build(java.util.Map<String, ?> map) throws Exception {
            GetWorkbenchTokenResponseBodyRoot self = new GetWorkbenchTokenResponseBodyRoot();
            return TeaModel.build(map, self);
        }

        public GetWorkbenchTokenResponseBodyRoot setInstanceLoginView(GetWorkbenchTokenResponseBodyRootInstanceLoginView instanceLoginView) {
            this.instanceLoginView = instanceLoginView;
            return this;
        }
        public GetWorkbenchTokenResponseBodyRootInstanceLoginView getInstanceLoginView() {
            return this.instanceLoginView;
        }

    }

}
