// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20181015.models;

import com.aliyun.tea.*;

public class GetTopicListResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TopicList")
    public GetTopicListResponseBodyTopicList topicList;

    @NameInMap("Total")
    public Integer total;

    public static GetTopicListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTopicListResponseBody self = new GetTopicListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTopicListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetTopicListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetTopicListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTopicListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetTopicListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTopicListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTopicListResponseBody setTopicList(GetTopicListResponseBodyTopicList topicList) {
        this.topicList = topicList;
        return this;
    }
    public GetTopicListResponseBodyTopicList getTopicList() {
        return this.topicList;
    }

    public GetTopicListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class GetTopicListResponseBodyTopicListTopicVO extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("StatusName")
        public String statusName;

        @NameInMap("Topic")
        public String topic;

        public static GetTopicListResponseBodyTopicListTopicVO build(java.util.Map<String, ?> map) throws Exception {
            GetTopicListResponseBodyTopicListTopicVO self = new GetTopicListResponseBodyTopicListTopicVO();
            return TeaModel.build(map, self);
        }

        public GetTopicListResponseBodyTopicListTopicVO setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetTopicListResponseBodyTopicListTopicVO setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetTopicListResponseBodyTopicListTopicVO setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetTopicListResponseBodyTopicListTopicVO setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetTopicListResponseBodyTopicListTopicVO setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetTopicListResponseBodyTopicListTopicVO setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public GetTopicListResponseBodyTopicListTopicVO setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class GetTopicListResponseBodyTopicList extends TeaModel {
        @NameInMap("TopicVO")
        public java.util.List<GetTopicListResponseBodyTopicListTopicVO> topicVO;

        public static GetTopicListResponseBodyTopicList build(java.util.Map<String, ?> map) throws Exception {
            GetTopicListResponseBodyTopicList self = new GetTopicListResponseBodyTopicList();
            return TeaModel.build(map, self);
        }

        public GetTopicListResponseBodyTopicList setTopicVO(java.util.List<GetTopicListResponseBodyTopicListTopicVO> topicVO) {
            this.topicVO = topicVO;
            return this;
        }
        public java.util.List<GetTopicListResponseBodyTopicListTopicVO> getTopicVO() {
            return this.topicVO;
        }

    }

}
