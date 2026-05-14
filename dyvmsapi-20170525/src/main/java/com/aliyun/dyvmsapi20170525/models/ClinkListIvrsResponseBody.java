// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkListIvrsResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClinkListIvrsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClinkListIvrsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkListIvrsResponseBody self = new ClinkListIvrsResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkListIvrsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkListIvrsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkListIvrsResponseBody setData(ClinkListIvrsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkListIvrsResponseBodyData getData() {
        return this.data;
    }

    public ClinkListIvrsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkListIvrsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkListIvrsResponseBodyDataIvrs extends TeaModel {
        /**
         * <p>语音导航描述</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>语音导航id</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>语音导航名称</p>
         * 
         * <strong>example:</strong>
         * <p>Name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>是否开启节点统计，0：不开启；1：开启</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Statistic")
        public Long statistic;

        public static ClinkListIvrsResponseBodyDataIvrs build(java.util.Map<String, ?> map) throws Exception {
            ClinkListIvrsResponseBodyDataIvrs self = new ClinkListIvrsResponseBodyDataIvrs();
            return TeaModel.build(map, self);
        }

        public ClinkListIvrsResponseBodyDataIvrs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ClinkListIvrsResponseBodyDataIvrs setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ClinkListIvrsResponseBodyDataIvrs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ClinkListIvrsResponseBodyDataIvrs setStatistic(Long statistic) {
            this.statistic = statistic;
            return this;
        }
        public Long getStatistic() {
            return this.statistic;
        }

    }

    public static class ClinkListIvrsResponseBodyData extends TeaModel {
        /**
         * <p>请求 id</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ClinkRequestId")
        public String clinkRequestId;

        /**
         * <p>语音导航列表</p>
         */
        @NameInMap("Ivrs")
        public java.util.List<ClinkListIvrsResponseBodyDataIvrs> ivrs;

        public static ClinkListIvrsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkListIvrsResponseBodyData self = new ClinkListIvrsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkListIvrsResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        public ClinkListIvrsResponseBodyData setIvrs(java.util.List<ClinkListIvrsResponseBodyDataIvrs> ivrs) {
            this.ivrs = ivrs;
            return this;
        }
        public java.util.List<ClinkListIvrsResponseBodyDataIvrs> getIvrs() {
            return this.ivrs;
        }

    }

}
