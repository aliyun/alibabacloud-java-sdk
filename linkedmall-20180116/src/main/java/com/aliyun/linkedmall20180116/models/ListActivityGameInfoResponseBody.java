// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ListActivityGameInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<ListActivityGameInfoResponseBodyModel> model;

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

    public static ListActivityGameInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListActivityGameInfoResponseBody self = new ListActivityGameInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListActivityGameInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListActivityGameInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListActivityGameInfoResponseBody setModel(java.util.List<ListActivityGameInfoResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<ListActivityGameInfoResponseBodyModel> getModel() {
        return this.model;
    }

    public ListActivityGameInfoResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListActivityGameInfoResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListActivityGameInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListActivityGameInfoResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListActivityGameInfoResponseBodyModel extends TeaModel {
        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("GameShowInfo")
        public String gameShowInfo;

        public static ListActivityGameInfoResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ListActivityGameInfoResponseBodyModel self = new ListActivityGameInfoResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ListActivityGameInfoResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public ListActivityGameInfoResponseBodyModel setGameShowInfo(String gameShowInfo) {
            this.gameShowInfo = gameShowInfo;
            return this;
        }
        public String getGameShowInfo() {
            return this.gameShowInfo;
        }

    }

}
