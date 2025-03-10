// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ListActivityAtmosphereResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<ListActivityAtmosphereResponseBodyModel> model;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>E090F1A0-7454-5F36-933C-E6332CE2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListActivityAtmosphereResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListActivityAtmosphereResponseBody self = new ListActivityAtmosphereResponseBody();
        return TeaModel.build(map, self);
    }

    public ListActivityAtmosphereResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListActivityAtmosphereResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListActivityAtmosphereResponseBody setModel(java.util.List<ListActivityAtmosphereResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<ListActivityAtmosphereResponseBodyModel> getModel() {
        return this.model;
    }

    public ListActivityAtmosphereResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListActivityAtmosphereResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListActivityAtmosphereResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListActivityAtmosphereResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListActivityAtmosphereResponseBodyModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>22******37</p>
         */
        @NameInMap("BizUid")
        public String bizUid;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListActivityAtmosphereResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ListActivityAtmosphereResponseBodyModel self = new ListActivityAtmosphereResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ListActivityAtmosphereResponseBodyModel setBizUid(String bizUid) {
            this.bizUid = bizUid;
            return this;
        }
        public String getBizUid() {
            return this.bizUid;
        }

        public ListActivityAtmosphereResponseBodyModel setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListActivityAtmosphereResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
