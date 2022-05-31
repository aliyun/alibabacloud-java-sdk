// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryLogistics4DistributionResponseBody extends TeaModel {
    // 渠道公共数据
    @NameInMap("BizViewData")
    public java.util.Map<String, ?> bizViewData;

    // 返回的执行结果码， 正确为字符串 0000
    @NameInMap("Code")
    public String code;

    // 每次请求操作对应的操作日志号，由系统自动生成，返回给租户，可用于排查问题，双方日志中统一透出此标识
    @NameInMap("LogsId")
    public String logsId;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // 请求结果数据
    @NameInMap("Model")
    public java.util.List<QueryLogistics4DistributionResponseBodyModel> model;

    // 当前页
    @NameInMap("PageNumber")
    public Long pageNumber;

    // pageSize
    @NameInMap("PageSize")
    public Long pageSize;

    // POP请求流水号，建议租户日志中也输出此流水号，双方排查问题方便
    @NameInMap("RequestId")
    public String requestId;

    // 错误子代码。一般用于显示业务类的错误代码，一般建议关注此类错误
    @NameInMap("SubCode")
    public String subCode;

    // 业务处理相关的错误信息，一般建议关注此类错误
    @NameInMap("SubMessage")
    public String subMessage;

    // 本次执行的结果成功与否
    @NameInMap("Success")
    public Boolean success;

    // 总数量
    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryLogistics4DistributionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLogistics4DistributionResponseBody self = new QueryLogistics4DistributionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLogistics4DistributionResponseBody setBizViewData(java.util.Map<String, ?> bizViewData) {
        this.bizViewData = bizViewData;
        return this;
    }
    public java.util.Map<String, ?> getBizViewData() {
        return this.bizViewData;
    }

    public QueryLogistics4DistributionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryLogistics4DistributionResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryLogistics4DistributionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLogistics4DistributionResponseBody setModel(java.util.List<QueryLogistics4DistributionResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<QueryLogistics4DistributionResponseBodyModel> getModel() {
        return this.model;
    }

    public QueryLogistics4DistributionResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryLogistics4DistributionResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryLogistics4DistributionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLogistics4DistributionResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryLogistics4DistributionResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryLogistics4DistributionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLogistics4DistributionResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryLogistics4DistributionResponseBodyModelGoods extends TeaModel {
        @NameInMap("GoodName")
        public String goodName;

        @NameInMap("LmItemid")
        public String lmItemid;

        @NameInMap("Quantity")
        public Integer quantity;

        public static QueryLogistics4DistributionResponseBodyModelGoods build(java.util.Map<String, ?> map) throws Exception {
            QueryLogistics4DistributionResponseBodyModelGoods self = new QueryLogistics4DistributionResponseBodyModelGoods();
            return TeaModel.build(map, self);
        }

        public QueryLogistics4DistributionResponseBodyModelGoods setGoodName(String goodName) {
            this.goodName = goodName;
            return this;
        }
        public String getGoodName() {
            return this.goodName;
        }

        public QueryLogistics4DistributionResponseBodyModelGoods setLmItemid(String lmItemid) {
            this.lmItemid = lmItemid;
            return this;
        }
        public String getLmItemid() {
            return this.lmItemid;
        }

        public QueryLogistics4DistributionResponseBodyModelGoods setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

    }

    public static class QueryLogistics4DistributionResponseBodyModelLogisticsDetailList extends TeaModel {
        @NameInMap("OcurrTimeStr")
        public String ocurrTimeStr;

        @NameInMap("StanderdDesc")
        public String standerdDesc;

        public static QueryLogistics4DistributionResponseBodyModelLogisticsDetailList build(java.util.Map<String, ?> map) throws Exception {
            QueryLogistics4DistributionResponseBodyModelLogisticsDetailList self = new QueryLogistics4DistributionResponseBodyModelLogisticsDetailList();
            return TeaModel.build(map, self);
        }

        public QueryLogistics4DistributionResponseBodyModelLogisticsDetailList setOcurrTimeStr(String ocurrTimeStr) {
            this.ocurrTimeStr = ocurrTimeStr;
            return this;
        }
        public String getOcurrTimeStr() {
            return this.ocurrTimeStr;
        }

        public QueryLogistics4DistributionResponseBodyModelLogisticsDetailList setStanderdDesc(String standerdDesc) {
            this.standerdDesc = standerdDesc;
            return this;
        }
        public String getStanderdDesc() {
            return this.standerdDesc;
        }

    }

    public static class QueryLogistics4DistributionResponseBodyModel extends TeaModel {
        @NameInMap("DataProvider")
        public String dataProvider;

        @NameInMap("DataProviderTitle")
        public String dataProviderTitle;

        @NameInMap("Goods")
        public java.util.List<QueryLogistics4DistributionResponseBodyModelGoods> goods;

        @NameInMap("LogisticsCompanyCode")
        public String logisticsCompanyCode;

        @NameInMap("LogisticsCompanyName")
        public String logisticsCompanyName;

        @NameInMap("LogisticsDetailList")
        public java.util.List<QueryLogistics4DistributionResponseBodyModelLogisticsDetailList> logisticsDetailList;

        @NameInMap("MailNo")
        public String mailNo;

        public static QueryLogistics4DistributionResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryLogistics4DistributionResponseBodyModel self = new QueryLogistics4DistributionResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryLogistics4DistributionResponseBodyModel setDataProvider(String dataProvider) {
            this.dataProvider = dataProvider;
            return this;
        }
        public String getDataProvider() {
            return this.dataProvider;
        }

        public QueryLogistics4DistributionResponseBodyModel setDataProviderTitle(String dataProviderTitle) {
            this.dataProviderTitle = dataProviderTitle;
            return this;
        }
        public String getDataProviderTitle() {
            return this.dataProviderTitle;
        }

        public QueryLogistics4DistributionResponseBodyModel setGoods(java.util.List<QueryLogistics4DistributionResponseBodyModelGoods> goods) {
            this.goods = goods;
            return this;
        }
        public java.util.List<QueryLogistics4DistributionResponseBodyModelGoods> getGoods() {
            return this.goods;
        }

        public QueryLogistics4DistributionResponseBodyModel setLogisticsCompanyCode(String logisticsCompanyCode) {
            this.logisticsCompanyCode = logisticsCompanyCode;
            return this;
        }
        public String getLogisticsCompanyCode() {
            return this.logisticsCompanyCode;
        }

        public QueryLogistics4DistributionResponseBodyModel setLogisticsCompanyName(String logisticsCompanyName) {
            this.logisticsCompanyName = logisticsCompanyName;
            return this;
        }
        public String getLogisticsCompanyName() {
            return this.logisticsCompanyName;
        }

        public QueryLogistics4DistributionResponseBodyModel setLogisticsDetailList(java.util.List<QueryLogistics4DistributionResponseBodyModelLogisticsDetailList> logisticsDetailList) {
            this.logisticsDetailList = logisticsDetailList;
            return this;
        }
        public java.util.List<QueryLogistics4DistributionResponseBodyModelLogisticsDetailList> getLogisticsDetailList() {
            return this.logisticsDetailList;
        }

        public QueryLogistics4DistributionResponseBodyModel setMailNo(String mailNo) {
            this.mailNo = mailNo;
            return this;
        }
        public String getMailNo() {
            return this.mailNo;
        }

    }

}
