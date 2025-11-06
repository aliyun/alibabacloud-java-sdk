// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ListQueueResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListQueueResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQueueResponseBody self = new ListQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQueueResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListQueueResponseBody setData(ListQueueResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListQueueResponseBodyData getData() {
        return this.data;
    }

    public ListQueueResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQueueResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListQueueResponseBodyDataVoListQueueVO extends TeaModel {
        @NameInMap("AccumulationCount")
        public Long accumulationCount;

        @NameInMap("Attributes")
        public java.util.Map<String, ?> attributes;

        @NameInMap("AutoDelete")
        public Boolean autoDelete;

        @NameInMap("CanDelete")
        public Boolean canDelete;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Durable")
        public Boolean durable;

        @NameInMap("Exclusive")
        public Boolean exclusive;

        @NameInMap("LastConsumeTime")
        public Long lastConsumeTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("VhostName")
        public String vhostName;

        public static ListQueueResponseBodyDataVoListQueueVO build(java.util.Map<String, ?> map) throws Exception {
            ListQueueResponseBodyDataVoListQueueVO self = new ListQueueResponseBodyDataVoListQueueVO();
            return TeaModel.build(map, self);
        }

        public ListQueueResponseBodyDataVoListQueueVO setAccumulationCount(Long accumulationCount) {
            this.accumulationCount = accumulationCount;
            return this;
        }
        public Long getAccumulationCount() {
            return this.accumulationCount;
        }

        public ListQueueResponseBodyDataVoListQueueVO setAttributes(java.util.Map<String, ?> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.Map<String, ?> getAttributes() {
            return this.attributes;
        }

        public ListQueueResponseBodyDataVoListQueueVO setAutoDelete(Boolean autoDelete) {
            this.autoDelete = autoDelete;
            return this;
        }
        public Boolean getAutoDelete() {
            return this.autoDelete;
        }

        public ListQueueResponseBodyDataVoListQueueVO setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListQueueResponseBodyDataVoListQueueVO setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListQueueResponseBodyDataVoListQueueVO setDurable(Boolean durable) {
            this.durable = durable;
            return this;
        }
        public Boolean getDurable() {
            return this.durable;
        }

        public ListQueueResponseBodyDataVoListQueueVO setExclusive(Boolean exclusive) {
            this.exclusive = exclusive;
            return this;
        }
        public Boolean getExclusive() {
            return this.exclusive;
        }

        public ListQueueResponseBodyDataVoListQueueVO setLastConsumeTime(Long lastConsumeTime) {
            this.lastConsumeTime = lastConsumeTime;
            return this;
        }
        public Long getLastConsumeTime() {
            return this.lastConsumeTime;
        }

        public ListQueueResponseBodyDataVoListQueueVO setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListQueueResponseBodyDataVoListQueueVO setVhostName(String vhostName) {
            this.vhostName = vhostName;
            return this;
        }
        public String getVhostName() {
            return this.vhostName;
        }

    }

    public static class ListQueueResponseBodyDataVoList extends TeaModel {
        @NameInMap("QueueVO")
        public java.util.List<ListQueueResponseBodyDataVoListQueueVO> queueVO;

        public static ListQueueResponseBodyDataVoList build(java.util.Map<String, ?> map) throws Exception {
            ListQueueResponseBodyDataVoList self = new ListQueueResponseBodyDataVoList();
            return TeaModel.build(map, self);
        }

        public ListQueueResponseBodyDataVoList setQueueVO(java.util.List<ListQueueResponseBodyDataVoListQueueVO> queueVO) {
            this.queueVO = queueVO;
            return this;
        }
        public java.util.List<ListQueueResponseBodyDataVoListQueueVO> getQueueVO() {
            return this.queueVO;
        }

    }

    public static class ListQueueResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("VoList")
        public ListQueueResponseBodyDataVoList voList;

        public static ListQueueResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListQueueResponseBodyData self = new ListQueueResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListQueueResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListQueueResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListQueueResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListQueueResponseBodyData setVoList(ListQueueResponseBodyDataVoList voList) {
            this.voList = voList;
            return this;
        }
        public ListQueueResponseBodyDataVoList getVoList() {
            return this.voList;
        }

    }

}
