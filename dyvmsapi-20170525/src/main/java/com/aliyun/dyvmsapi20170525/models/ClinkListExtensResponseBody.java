// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkListExtensResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClinkListExtensResponseBodyData data;

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

    public static ClinkListExtensResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkListExtensResponseBody self = new ClinkListExtensResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkListExtensResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkListExtensResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkListExtensResponseBody setData(ClinkListExtensResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkListExtensResponseBodyData getData() {
        return this.data;
    }

    public ClinkListExtensResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkListExtensResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkListExtensResponseBodyDataExtens extends TeaModel {
        /**
         * <p>语音编码。1：g729(已弃用)；2：g729,alaw,ulaw；3：alaw,ulaw,g729；4：myopus,alaw,ulaw,g729；5：alaw,ulaw；6：myopus,alaw,ulaw</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Allow")
        public Long allow;

        /**
         * <p>话机区号</p>
         * 
         * <strong>example:</strong>
         * <p>010</p>
         */
        @NameInMap("AreaCode")
        public String areaCode;

        /**
         * <p>话机号码</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ExtenNumber")
        public String extenNumber;

        /**
         * <p>是否允许主叫外呼，1：允许；0：不允许。话机类型为IP话机时，可以开启主叫外呼功能，直接通过IP话机进行外呼。若要使用主叫外呼功能，需要开启企业级开关。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsDirect")
        public Long isDirect;

        /**
         * <p>网络防抖开关，0：关闭；1：开启</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("JittBuffer")
        public Long jittBuffer;

        /**
         * <p>话机类型。1: IP话机， 2: 软电话</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Long type;

        public static ClinkListExtensResponseBodyDataExtens build(java.util.Map<String, ?> map) throws Exception {
            ClinkListExtensResponseBodyDataExtens self = new ClinkListExtensResponseBodyDataExtens();
            return TeaModel.build(map, self);
        }

        public ClinkListExtensResponseBodyDataExtens setAllow(Long allow) {
            this.allow = allow;
            return this;
        }
        public Long getAllow() {
            return this.allow;
        }

        public ClinkListExtensResponseBodyDataExtens setAreaCode(String areaCode) {
            this.areaCode = areaCode;
            return this;
        }
        public String getAreaCode() {
            return this.areaCode;
        }

        public ClinkListExtensResponseBodyDataExtens setExtenNumber(String extenNumber) {
            this.extenNumber = extenNumber;
            return this;
        }
        public String getExtenNumber() {
            return this.extenNumber;
        }

        public ClinkListExtensResponseBodyDataExtens setIsDirect(Long isDirect) {
            this.isDirect = isDirect;
            return this;
        }
        public Long getIsDirect() {
            return this.isDirect;
        }

        public ClinkListExtensResponseBodyDataExtens setJittBuffer(Long jittBuffer) {
            this.jittBuffer = jittBuffer;
            return this;
        }
        public Long getJittBuffer() {
            return this.jittBuffer;
        }

        public ClinkListExtensResponseBodyDataExtens setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

    public static class ClinkListExtensResponseBodyData extends TeaModel {
        /**
         * <p>请求 id</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ClinkRequestId")
        public String clinkRequestId;

        /**
         * <p>话机对象列表</p>
         */
        @NameInMap("Extens")
        public java.util.List<ClinkListExtensResponseBodyDataExtens> extens;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>38</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ClinkListExtensResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkListExtensResponseBodyData self = new ClinkListExtensResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkListExtensResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        public ClinkListExtensResponseBodyData setExtens(java.util.List<ClinkListExtensResponseBodyDataExtens> extens) {
            this.extens = extens;
            return this;
        }
        public java.util.List<ClinkListExtensResponseBodyDataExtens> getExtens() {
            return this.extens;
        }

        public ClinkListExtensResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ClinkListExtensResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ClinkListExtensResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
