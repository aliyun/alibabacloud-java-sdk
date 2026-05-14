// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkListQueuesResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClinkListQueuesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9FF70B74-1B3C-44C1-ACDF-8DF962988F0E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClinkListQueuesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkListQueuesResponseBody self = new ClinkListQueuesResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkListQueuesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkListQueuesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkListQueuesResponseBody setData(ClinkListQueuesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkListQueuesResponseBodyData getData() {
        return this.data;
    }

    public ClinkListQueuesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkListQueuesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkListQueuesResponseBodyDataQueues extends TeaModel {
        /**
         * <p>呼叫中心座席数</p>
         * 
         * <strong>example:</strong>
         * <p>51</p>
         */
        @NameInMap("CallClientNum")
        public Long callClientNum;

        /**
         * <p>在线客服数</p>
         * 
         * <strong>example:</strong>
         * <p>72</p>
         */
        @NameInMap("ChatClientNum")
        public Long chatClientNum;

        /**
         * <p>队列 Id</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>队列名</p>
         * 
         * <strong>example:</strong>
         * <p>Name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>全渠道座席数</p>
         * 
         * <strong>example:</strong>
         * <p>87</p>
         */
        @NameInMap("OmniClientNum")
        public Long omniClientNum;

        /**
         * <p>队列号</p>
         * 
         * <strong>example:</strong>
         * <p>1221</p>
         */
        @NameInMap("Qno")
        public String qno;

        public static ClinkListQueuesResponseBodyDataQueues build(java.util.Map<String, ?> map) throws Exception {
            ClinkListQueuesResponseBodyDataQueues self = new ClinkListQueuesResponseBodyDataQueues();
            return TeaModel.build(map, self);
        }

        public ClinkListQueuesResponseBodyDataQueues setCallClientNum(Long callClientNum) {
            this.callClientNum = callClientNum;
            return this;
        }
        public Long getCallClientNum() {
            return this.callClientNum;
        }

        public ClinkListQueuesResponseBodyDataQueues setChatClientNum(Long chatClientNum) {
            this.chatClientNum = chatClientNum;
            return this;
        }
        public Long getChatClientNum() {
            return this.chatClientNum;
        }

        public ClinkListQueuesResponseBodyDataQueues setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ClinkListQueuesResponseBodyDataQueues setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ClinkListQueuesResponseBodyDataQueues setOmniClientNum(Long omniClientNum) {
            this.omniClientNum = omniClientNum;
            return this;
        }
        public Long getOmniClientNum() {
            return this.omniClientNum;
        }

        public ClinkListQueuesResponseBodyDataQueues setQno(String qno) {
            this.qno = qno;
            return this;
        }
        public String getQno() {
            return this.qno;
        }

    }

    public static class ClinkListQueuesResponseBodyData extends TeaModel {
        /**
         * <p>本次请求id</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ClinkRequestId")
        public String clinkRequestId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>分页大小</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>queues</p>
         */
        @NameInMap("Queues")
        public java.util.List<ClinkListQueuesResponseBodyDataQueues> queues;

        /**
         * <p>总数</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ClinkListQueuesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkListQueuesResponseBodyData self = new ClinkListQueuesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkListQueuesResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        public ClinkListQueuesResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ClinkListQueuesResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ClinkListQueuesResponseBodyData setQueues(java.util.List<ClinkListQueuesResponseBodyDataQueues> queues) {
            this.queues = queues;
            return this;
        }
        public java.util.List<ClinkListQueuesResponseBodyDataQueues> getQueues() {
            return this.queues;
        }

        public ClinkListQueuesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
