// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryCardSmsStatisticsListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Model")
    public java.util.List<QueryCardSmsStatisticsListResponseBodyModel> model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryCardSmsStatisticsListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCardSmsStatisticsListResponseBody self = new QueryCardSmsStatisticsListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCardSmsStatisticsListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCardSmsStatisticsListResponseBody setModel(java.util.List<QueryCardSmsStatisticsListResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<QueryCardSmsStatisticsListResponseBodyModel> getModel() {
        return this.model;
    }

    public QueryCardSmsStatisticsListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCardSmsStatisticsListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCardSmsStatisticsListResponseBodyModel extends TeaModel {
        @NameInMap("RenderSuccessTotal")
        public Long renderSuccessTotal;

        @NameInMap("SendDate")
        public String sendDate;

        @NameInMap("UrlGenerateTotal")
        public Long urlGenerateTotal;

        public static QueryCardSmsStatisticsListResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryCardSmsStatisticsListResponseBodyModel self = new QueryCardSmsStatisticsListResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryCardSmsStatisticsListResponseBodyModel setRenderSuccessTotal(Long renderSuccessTotal) {
            this.renderSuccessTotal = renderSuccessTotal;
            return this;
        }
        public Long getRenderSuccessTotal() {
            return this.renderSuccessTotal;
        }

        public QueryCardSmsStatisticsListResponseBodyModel setSendDate(String sendDate) {
            this.sendDate = sendDate;
            return this;
        }
        public String getSendDate() {
            return this.sendDate;
        }

        public QueryCardSmsStatisticsListResponseBodyModel setUrlGenerateTotal(Long urlGenerateTotal) {
            this.urlGenerateTotal = urlGenerateTotal;
            return this;
        }
        public Long getUrlGenerateTotal() {
            return this.urlGenerateTotal;
        }

    }

}
