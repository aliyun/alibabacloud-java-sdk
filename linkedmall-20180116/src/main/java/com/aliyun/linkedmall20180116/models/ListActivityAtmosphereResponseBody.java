// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ListActivityAtmosphereResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<ListActivityAtmosphereResponseBodyModel> model;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // TotalCount本次请求条件下的数据总量，此参数为可选参数，默认可不返回
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
        @NameInMap("BizUid")
        public String bizUid;

        @NameInMap("Message")
        public String message;

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
