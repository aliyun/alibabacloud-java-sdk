// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ListDistributionItemResponseBody extends TeaModel {
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
    public java.util.List<ListDistributionItemResponseBodyModel> model;

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

    public static ListDistributionItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDistributionItemResponseBody self = new ListDistributionItemResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDistributionItemResponseBody setBizViewData(java.util.Map<String, ?> bizViewData) {
        this.bizViewData = bizViewData;
        return this;
    }
    public java.util.Map<String, ?> getBizViewData() {
        return this.bizViewData;
    }

    public ListDistributionItemResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDistributionItemResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public ListDistributionItemResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDistributionItemResponseBody setModel(java.util.List<ListDistributionItemResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<ListDistributionItemResponseBodyModel> getModel() {
        return this.model;
    }

    public ListDistributionItemResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDistributionItemResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDistributionItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDistributionItemResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public ListDistributionItemResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public ListDistributionItemResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDistributionItemResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDistributionItemResponseBodyModelMSkuList extends TeaModel {
        @NameInMap("MCanSell")
        public String MCanSell;

        @NameInMap("MPriceCent")
        public String MPriceCent;

        @NameInMap("MSkuId")
        public String MSkuId;

        @NameInMap("MSkuPicUrl")
        public String MSkuPicUrl;

        @NameInMap("MSkuTitle")
        public String MSkuTitle;

        @NameInMap("MTaoBaoCurrentPrice")
        public String MTaoBaoCurrentPrice;

        public static ListDistributionItemResponseBodyModelMSkuList build(java.util.Map<String, ?> map) throws Exception {
            ListDistributionItemResponseBodyModelMSkuList self = new ListDistributionItemResponseBodyModelMSkuList();
            return TeaModel.build(map, self);
        }

        public ListDistributionItemResponseBodyModelMSkuList setMCanSell(String MCanSell) {
            this.MCanSell = MCanSell;
            return this;
        }
        public String getMCanSell() {
            return this.MCanSell;
        }

        public ListDistributionItemResponseBodyModelMSkuList setMPriceCent(String MPriceCent) {
            this.MPriceCent = MPriceCent;
            return this;
        }
        public String getMPriceCent() {
            return this.MPriceCent;
        }

        public ListDistributionItemResponseBodyModelMSkuList setMSkuId(String MSkuId) {
            this.MSkuId = MSkuId;
            return this;
        }
        public String getMSkuId() {
            return this.MSkuId;
        }

        public ListDistributionItemResponseBodyModelMSkuList setMSkuPicUrl(String MSkuPicUrl) {
            this.MSkuPicUrl = MSkuPicUrl;
            return this;
        }
        public String getMSkuPicUrl() {
            return this.MSkuPicUrl;
        }

        public ListDistributionItemResponseBodyModelMSkuList setMSkuTitle(String MSkuTitle) {
            this.MSkuTitle = MSkuTitle;
            return this;
        }
        public String getMSkuTitle() {
            return this.MSkuTitle;
        }

        public ListDistributionItemResponseBodyModelMSkuList setMTaoBaoCurrentPrice(String MTaoBaoCurrentPrice) {
            this.MTaoBaoCurrentPrice = MTaoBaoCurrentPrice;
            return this;
        }
        public String getMTaoBaoCurrentPrice() {
            return this.MTaoBaoCurrentPrice;
        }

    }

    public static class ListDistributionItemResponseBodyModel extends TeaModel {
        @NameInMap("MCanSell")
        public String MCanSell;

        @NameInMap("MCategoryId")
        public String MCategoryId;

        @NameInMap("MItemId")
        public String MItemId;

        @NameInMap("MItemTitle")
        public String MItemTitle;

        @NameInMap("MMainPicUrl")
        public String MMainPicUrl;

        @NameInMap("MReservePrice")
        public String MReservePrice;

        @NameInMap("MSkuList")
        public java.util.List<ListDistributionItemResponseBodyModelMSkuList> MSkuList;

        public static ListDistributionItemResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ListDistributionItemResponseBodyModel self = new ListDistributionItemResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ListDistributionItemResponseBodyModel setMCanSell(String MCanSell) {
            this.MCanSell = MCanSell;
            return this;
        }
        public String getMCanSell() {
            return this.MCanSell;
        }

        public ListDistributionItemResponseBodyModel setMCategoryId(String MCategoryId) {
            this.MCategoryId = MCategoryId;
            return this;
        }
        public String getMCategoryId() {
            return this.MCategoryId;
        }

        public ListDistributionItemResponseBodyModel setMItemId(String MItemId) {
            this.MItemId = MItemId;
            return this;
        }
        public String getMItemId() {
            return this.MItemId;
        }

        public ListDistributionItemResponseBodyModel setMItemTitle(String MItemTitle) {
            this.MItemTitle = MItemTitle;
            return this;
        }
        public String getMItemTitle() {
            return this.MItemTitle;
        }

        public ListDistributionItemResponseBodyModel setMMainPicUrl(String MMainPicUrl) {
            this.MMainPicUrl = MMainPicUrl;
            return this;
        }
        public String getMMainPicUrl() {
            return this.MMainPicUrl;
        }

        public ListDistributionItemResponseBodyModel setMReservePrice(String MReservePrice) {
            this.MReservePrice = MReservePrice;
            return this;
        }
        public String getMReservePrice() {
            return this.MReservePrice;
        }

        public ListDistributionItemResponseBodyModel setMSkuList(java.util.List<ListDistributionItemResponseBodyModelMSkuList> MSkuList) {
            this.MSkuList = MSkuList;
            return this;
        }
        public java.util.List<ListDistributionItemResponseBodyModelMSkuList> getMSkuList() {
            return this.MSkuList;
        }

    }

}
