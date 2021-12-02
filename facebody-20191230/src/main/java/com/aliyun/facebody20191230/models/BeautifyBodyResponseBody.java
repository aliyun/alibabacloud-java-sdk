// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class BeautifyBodyResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("Data")
    public BeautifyBodyResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static BeautifyBodyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BeautifyBodyResponseBody self = new BeautifyBodyResponseBody();
        return TeaModel.build(map, self);
    }

    public BeautifyBodyResponseBody setData(BeautifyBodyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BeautifyBodyResponseBodyData getData() {
        return this.data;
    }

    public BeautifyBodyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BeautifyBodyResponseBodyData extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("XFlowURL")
        public String XFlowURL;

        @NameInMap("YFlowURL")
        public String YFlowURL;

        public static BeautifyBodyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BeautifyBodyResponseBodyData self = new BeautifyBodyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BeautifyBodyResponseBodyData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public BeautifyBodyResponseBodyData setXFlowURL(String XFlowURL) {
            this.XFlowURL = XFlowURL;
            return this;
        }
        public String getXFlowURL() {
            return this.XFlowURL;
        }

        public BeautifyBodyResponseBodyData setYFlowURL(String YFlowURL) {
            this.YFlowURL = YFlowURL;
            return this;
        }
        public String getYFlowURL() {
            return this.YFlowURL;
        }

    }

}
