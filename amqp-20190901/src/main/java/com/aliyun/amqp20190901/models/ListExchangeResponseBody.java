// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ListExchangeResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListExchangeResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListExchangeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExchangeResponseBody self = new ListExchangeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExchangeResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListExchangeResponseBody setData(ListExchangeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListExchangeResponseBodyData getData() {
        return this.data;
    }

    public ListExchangeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListExchangeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExchangeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListExchangeResponseBodyDataVoListExchangVO extends TeaModel {
        @NameInMap("Attributes")
        public String attributes;

        @NameInMap("AutoDelete")
        public Boolean autoDelete;

        @NameInMap("CanDelete")
        public Boolean canDelete;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ExchangeType")
        public Integer exchangeType;

        @NameInMap("Internal")
        public Boolean internal;

        @NameInMap("Name")
        public String name;

        @NameInMap("VhostName")
        public String vhostName;

        public static ListExchangeResponseBodyDataVoListExchangVO build(java.util.Map<String, ?> map) throws Exception {
            ListExchangeResponseBodyDataVoListExchangVO self = new ListExchangeResponseBodyDataVoListExchangVO();
            return TeaModel.build(map, self);
        }

        public ListExchangeResponseBodyDataVoListExchangVO setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public ListExchangeResponseBodyDataVoListExchangVO setAutoDelete(Boolean autoDelete) {
            this.autoDelete = autoDelete;
            return this;
        }
        public Boolean getAutoDelete() {
            return this.autoDelete;
        }

        public ListExchangeResponseBodyDataVoListExchangVO setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListExchangeResponseBodyDataVoListExchangVO setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListExchangeResponseBodyDataVoListExchangVO setExchangeType(Integer exchangeType) {
            this.exchangeType = exchangeType;
            return this;
        }
        public Integer getExchangeType() {
            return this.exchangeType;
        }

        public ListExchangeResponseBodyDataVoListExchangVO setInternal(Boolean internal) {
            this.internal = internal;
            return this;
        }
        public Boolean getInternal() {
            return this.internal;
        }

        public ListExchangeResponseBodyDataVoListExchangVO setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListExchangeResponseBodyDataVoListExchangVO setVhostName(String vhostName) {
            this.vhostName = vhostName;
            return this;
        }
        public String getVhostName() {
            return this.vhostName;
        }

    }

    public static class ListExchangeResponseBodyDataVoList extends TeaModel {
        @NameInMap("ExchangVO")
        public java.util.List<ListExchangeResponseBodyDataVoListExchangVO> exchangVO;

        public static ListExchangeResponseBodyDataVoList build(java.util.Map<String, ?> map) throws Exception {
            ListExchangeResponseBodyDataVoList self = new ListExchangeResponseBodyDataVoList();
            return TeaModel.build(map, self);
        }

        public ListExchangeResponseBodyDataVoList setExchangVO(java.util.List<ListExchangeResponseBodyDataVoListExchangVO> exchangVO) {
            this.exchangVO = exchangVO;
            return this;
        }
        public java.util.List<ListExchangeResponseBodyDataVoListExchangVO> getExchangVO() {
            return this.exchangVO;
        }

    }

    public static class ListExchangeResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("VoList")
        public ListExchangeResponseBodyDataVoList voList;

        public static ListExchangeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListExchangeResponseBodyData self = new ListExchangeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListExchangeResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListExchangeResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListExchangeResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListExchangeResponseBodyData setVoList(ListExchangeResponseBodyDataVoList voList) {
            this.voList = voList;
            return this;
        }
        public ListExchangeResponseBodyDataVoList getVoList() {
            return this.voList;
        }

    }

}
