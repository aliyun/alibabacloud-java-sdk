// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class GenerateReportResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<GenerateReportResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>imageUrl download failed</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>528B54D4-3AAB-47CF-B6CE-0C2A2FB4C7C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateReportResponseBody self = new GenerateReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateReportResponseBody setData(java.util.List<GenerateReportResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GenerateReportResponseBodyData> getData() {
        return this.data;
    }

    public GenerateReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateReportResponseBodyData extends TeaModel {
        @NameInMap("ActionNames")
        public java.util.List<String> actionNames;

        /**
         * <strong>example:</strong>
         * <p>PDF</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p><a href="http://viapi-customer-pop.oss-cn-shanghai.aliyuncs.com/cefe_295855287226852864_23eebf3799c7442a992d2e56fde87616">http://viapi-customer-pop.oss-cn-shanghai.aliyuncs.com/cefe_295855287226852864_23eebf3799c7442a992d2e56fde87616</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GenerateReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateReportResponseBodyData self = new GenerateReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateReportResponseBodyData setActionNames(java.util.List<String> actionNames) {
            this.actionNames = actionNames;
            return this;
        }
        public java.util.List<String> getActionNames() {
            return this.actionNames;
        }

        public GenerateReportResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GenerateReportResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
