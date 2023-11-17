// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class ListBindingAccountByDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListBindingAccountByDeviceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListBindingAccountByDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBindingAccountByDeviceResponseBody self = new ListBindingAccountByDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBindingAccountByDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBindingAccountByDeviceResponseBody setData(ListBindingAccountByDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListBindingAccountByDeviceResponseBodyData getData() {
        return this.data;
    }

    public ListBindingAccountByDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListBindingAccountByDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBindingAccountByDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListBindingAccountByDeviceResponseBodyDataAccountList extends TeaModel {
        @NameInMap("BindTime")
        public Long bindTime;

        @NameInMap("IdentityAlias")
        public String identityAlias;

        @NameInMap("IdentityId")
        public String identityId;

        public static ListBindingAccountByDeviceResponseBodyDataAccountList build(java.util.Map<String, ?> map) throws Exception {
            ListBindingAccountByDeviceResponseBodyDataAccountList self = new ListBindingAccountByDeviceResponseBodyDataAccountList();
            return TeaModel.build(map, self);
        }

        public ListBindingAccountByDeviceResponseBodyDataAccountList setBindTime(Long bindTime) {
            this.bindTime = bindTime;
            return this;
        }
        public Long getBindTime() {
            return this.bindTime;
        }

        public ListBindingAccountByDeviceResponseBodyDataAccountList setIdentityAlias(String identityAlias) {
            this.identityAlias = identityAlias;
            return this;
        }
        public String getIdentityAlias() {
            return this.identityAlias;
        }

        public ListBindingAccountByDeviceResponseBodyDataAccountList setIdentityId(String identityId) {
            this.identityId = identityId;
            return this;
        }
        public String getIdentityId() {
            return this.identityId;
        }

    }

    public static class ListBindingAccountByDeviceResponseBodyData extends TeaModel {
        @NameInMap("AccountList")
        public java.util.List<ListBindingAccountByDeviceResponseBodyDataAccountList> accountList;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static ListBindingAccountByDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBindingAccountByDeviceResponseBodyData self = new ListBindingAccountByDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBindingAccountByDeviceResponseBodyData setAccountList(java.util.List<ListBindingAccountByDeviceResponseBodyDataAccountList> accountList) {
            this.accountList = accountList;
            return this;
        }
        public java.util.List<ListBindingAccountByDeviceResponseBodyDataAccountList> getAccountList() {
            return this.accountList;
        }

        public ListBindingAccountByDeviceResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListBindingAccountByDeviceResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListBindingAccountByDeviceResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
