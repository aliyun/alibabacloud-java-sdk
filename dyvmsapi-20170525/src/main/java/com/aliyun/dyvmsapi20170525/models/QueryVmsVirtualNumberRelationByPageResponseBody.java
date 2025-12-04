// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryVmsVirtualNumberRelationByPageResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QueryVmsVirtualNumberRelationByPageResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>01A58FA5-422C-58E0-AA71-B307A665416F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryVmsVirtualNumberRelationByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryVmsVirtualNumberRelationByPageResponseBody self = new QueryVmsVirtualNumberRelationByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryVmsVirtualNumberRelationByPageResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryVmsVirtualNumberRelationByPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryVmsVirtualNumberRelationByPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryVmsVirtualNumberRelationByPageResponseBody setModel(QueryVmsVirtualNumberRelationByPageResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryVmsVirtualNumberRelationByPageResponseBodyModel getModel() {
        return this.model;
    }

    public QueryVmsVirtualNumberRelationByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryVmsVirtualNumberRelationByPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryVmsVirtualNumberRelationByPageResponseBodyModelData extends TeaModel {
        /**
         * <p>号码归属地--城市</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("NumberCity")
        public String numberCity;

        /**
         * <p>号码归属地--省</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("NumberProvince")
        public String numberProvince;

        /**
         * <p>真实号码</p>
         * 
         * <strong>example:</strong>
         * <p>131****1234</p>
         */
        @NameInMap("RealNumber")
        public String realNumber;

        /**
         * <p>状态 1:有效；0:无效；-1:注销</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("State")
        public Long state;

        /**
         * <p>虚拟号码</p>
         * 
         * <strong>example:</strong>
         * <p>0571***1234</p>
         */
        @NameInMap("VirtualNumber")
        public String virtualNumber;

        public static QueryVmsVirtualNumberRelationByPageResponseBodyModelData build(java.util.Map<String, ?> map) throws Exception {
            QueryVmsVirtualNumberRelationByPageResponseBodyModelData self = new QueryVmsVirtualNumberRelationByPageResponseBodyModelData();
            return TeaModel.build(map, self);
        }

        public QueryVmsVirtualNumberRelationByPageResponseBodyModelData setNumberCity(String numberCity) {
            this.numberCity = numberCity;
            return this;
        }
        public String getNumberCity() {
            return this.numberCity;
        }

        public QueryVmsVirtualNumberRelationByPageResponseBodyModelData setNumberProvince(String numberProvince) {
            this.numberProvince = numberProvince;
            return this;
        }
        public String getNumberProvince() {
            return this.numberProvince;
        }

        public QueryVmsVirtualNumberRelationByPageResponseBodyModelData setRealNumber(String realNumber) {
            this.realNumber = realNumber;
            return this;
        }
        public String getRealNumber() {
            return this.realNumber;
        }

        public QueryVmsVirtualNumberRelationByPageResponseBodyModelData setState(Long state) {
            this.state = state;
            return this;
        }
        public Long getState() {
            return this.state;
        }

        public QueryVmsVirtualNumberRelationByPageResponseBodyModelData setVirtualNumber(String virtualNumber) {
            this.virtualNumber = virtualNumber;
            return this;
        }
        public String getVirtualNumber() {
            return this.virtualNumber;
        }

    }

    public static class QueryVmsVirtualNumberRelationByPageResponseBodyModel extends TeaModel {
        @NameInMap("Data")
        public java.util.List<QueryVmsVirtualNumberRelationByPageResponseBodyModelData> data;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <strong>example:</strong>
         * <p>65</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>231</p>
         */
        @NameInMap("Total")
        public Long total;

        public static QueryVmsVirtualNumberRelationByPageResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryVmsVirtualNumberRelationByPageResponseBodyModel self = new QueryVmsVirtualNumberRelationByPageResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryVmsVirtualNumberRelationByPageResponseBodyModel setData(java.util.List<QueryVmsVirtualNumberRelationByPageResponseBodyModelData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryVmsVirtualNumberRelationByPageResponseBodyModelData> getData() {
            return this.data;
        }

        public QueryVmsVirtualNumberRelationByPageResponseBodyModel setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public QueryVmsVirtualNumberRelationByPageResponseBodyModel setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryVmsVirtualNumberRelationByPageResponseBodyModel setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
