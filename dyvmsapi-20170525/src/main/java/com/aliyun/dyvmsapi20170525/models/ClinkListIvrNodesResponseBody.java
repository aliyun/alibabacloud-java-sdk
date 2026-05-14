// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkListIvrNodesResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClinkListIvrNodesResponseBodyData data;

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

    public static ClinkListIvrNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkListIvrNodesResponseBody self = new ClinkListIvrNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkListIvrNodesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkListIvrNodesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkListIvrNodesResponseBody setData(ClinkListIvrNodesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkListIvrNodesResponseBodyData getData() {
        return this.data;
    }

    public ClinkListIvrNodesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkListIvrNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkListIvrNodesResponseBodyDataIvrNodes extends TeaModel {
        /**
         * <p>语音导航节点</p>
         * 
         * <strong>example:</strong>
         * <p>E91_rp0D1</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>语音导航常用节点</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("FrequentlyPath")
        public String frequentlyPath;

        /**
         * <p>语音导航节点id</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>语音导航id</p>
         * 
         * <strong>example:</strong>
         * <p>53</p>
         */
        @NameInMap("IvrId")
        public Long ivrId;

        /**
         * <p>语音导航节点名称</p>
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

        public static ClinkListIvrNodesResponseBodyDataIvrNodes build(java.util.Map<String, ?> map) throws Exception {
            ClinkListIvrNodesResponseBodyDataIvrNodes self = new ClinkListIvrNodesResponseBodyDataIvrNodes();
            return TeaModel.build(map, self);
        }

        public ClinkListIvrNodesResponseBodyDataIvrNodes setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ClinkListIvrNodesResponseBodyDataIvrNodes setFrequentlyPath(String frequentlyPath) {
            this.frequentlyPath = frequentlyPath;
            return this;
        }
        public String getFrequentlyPath() {
            return this.frequentlyPath;
        }

        public ClinkListIvrNodesResponseBodyDataIvrNodes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ClinkListIvrNodesResponseBodyDataIvrNodes setIvrId(Long ivrId) {
            this.ivrId = ivrId;
            return this;
        }
        public Long getIvrId() {
            return this.ivrId;
        }

        public ClinkListIvrNodesResponseBodyDataIvrNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ClinkListIvrNodesResponseBodyDataIvrNodes setStatistic(Long statistic) {
            this.statistic = statistic;
            return this;
        }
        public Long getStatistic() {
            return this.statistic;
        }

    }

    public static class ClinkListIvrNodesResponseBodyData extends TeaModel {
        /**
         * <p>请求 id</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ClinkRequestId")
        public String clinkRequestId;

        /**
         * <p>语音导航节点列表</p>
         */
        @NameInMap("IvrNodes")
        public java.util.List<ClinkListIvrNodesResponseBodyDataIvrNodes> ivrNodes;

        public static ClinkListIvrNodesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkListIvrNodesResponseBodyData self = new ClinkListIvrNodesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkListIvrNodesResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        public ClinkListIvrNodesResponseBodyData setIvrNodes(java.util.List<ClinkListIvrNodesResponseBodyDataIvrNodes> ivrNodes) {
            this.ivrNodes = ivrNodes;
            return this;
        }
        public java.util.List<ClinkListIvrNodesResponseBodyDataIvrNodes> getIvrNodes() {
            return this.ivrNodes;
        }

    }

}
