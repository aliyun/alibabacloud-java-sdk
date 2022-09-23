// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetPostScriptsResponseBody extends TeaModel {
    @NameInMap("PostInstallScripts")
    public java.util.List<GetPostScriptsResponseBodyPostInstallScripts> postInstallScripts;

    @NameInMap("RequestId")
    public String requestId;

    public static GetPostScriptsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPostScriptsResponseBody self = new GetPostScriptsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPostScriptsResponseBody setPostInstallScripts(java.util.List<GetPostScriptsResponseBodyPostInstallScripts> postInstallScripts) {
        this.postInstallScripts = postInstallScripts;
        return this;
    }
    public java.util.List<GetPostScriptsResponseBodyPostInstallScripts> getPostInstallScripts() {
        return this.postInstallScripts;
    }

    public GetPostScriptsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPostScriptsResponseBodyPostInstallScripts extends TeaModel {
        @NameInMap("Args")
        public String args;

        @NameInMap("Url")
        public String url;

        public static GetPostScriptsResponseBodyPostInstallScripts build(java.util.Map<String, ?> map) throws Exception {
            GetPostScriptsResponseBodyPostInstallScripts self = new GetPostScriptsResponseBodyPostInstallScripts();
            return TeaModel.build(map, self);
        }

        public GetPostScriptsResponseBodyPostInstallScripts setArgs(String args) {
            this.args = args;
            return this;
        }
        public String getArgs() {
            return this.args;
        }

        public GetPostScriptsResponseBodyPostInstallScripts setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
