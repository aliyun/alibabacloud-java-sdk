// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListAuthorizationResponseBody extends TeaModel {
    @NameInMap("success")
    public Boolean success;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("data")
    public ListAuthorizationResponseBodyData data;

    public static ListAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationResponseBody self = new ListAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAuthorizationResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListAuthorizationResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public ListAuthorizationResponseBody setData(ListAuthorizationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAuthorizationResponseBodyData getData() {
        return this.data;
    }

    public static class ListAuthorizationResponseBodyDataList extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("uid")
        public String uid;

        @NameInMap("grantor")
        public String grantor;

        @NameInMap("grantee")
        public String grantee;

        @NameInMap("resourceType")
        public String resourceType;

        @NameInMap("resourceIdentifier")
        public String resourceIdentifier;

        @NameInMap("effect")
        public String effect;

        @NameInMap("description")
        public String description;

        public static ListAuthorizationResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizationResponseBodyDataList self = new ListAuthorizationResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListAuthorizationResponseBodyDataList setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListAuthorizationResponseBodyDataList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListAuthorizationResponseBodyDataList setGrantor(String grantor) {
            this.grantor = grantor;
            return this;
        }
        public String getGrantor() {
            return this.grantor;
        }

        public ListAuthorizationResponseBodyDataList setGrantee(String grantee) {
            this.grantee = grantee;
            return this;
        }
        public String getGrantee() {
            return this.grantee;
        }

        public ListAuthorizationResponseBodyDataList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListAuthorizationResponseBodyDataList setResourceIdentifier(String resourceIdentifier) {
            this.resourceIdentifier = resourceIdentifier;
            return this;
        }
        public String getResourceIdentifier() {
            return this.resourceIdentifier;
        }

        public ListAuthorizationResponseBodyDataList setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public ListAuthorizationResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class ListAuthorizationResponseBodyData extends TeaModel {
        @NameInMap("total")
        public Long total;

        @NameInMap("pageSize")
        public Long pageSize;

        @NameInMap("pageNum")
        public Long pageNum;

        @NameInMap("list")
        public java.util.List<ListAuthorizationResponseBodyDataList> list;

        public static ListAuthorizationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizationResponseBodyData self = new ListAuthorizationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAuthorizationResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListAuthorizationResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListAuthorizationResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public ListAuthorizationResponseBodyData setList(java.util.List<ListAuthorizationResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListAuthorizationResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
