// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class UserQueryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("module")
    public UserQueryResponseBodyModule module;

    @NameInMap("result_code")
    public Integer resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static UserQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UserQueryResponseBody self = new UserQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public UserQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UserQueryResponseBody setModule(UserQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public UserQueryResponseBodyModule getModule() {
        return this.module;
    }

    public UserQueryResponseBody setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public Integer getResultCode() {
        return this.resultCode;
    }

    public UserQueryResponseBody setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UserQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UserQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class UserQueryResponseBodyModuleItems extends TeaModel {
        @NameInMap("employee_nick")
        public String employeeNick;

        @NameInMap("third_part_employee_id")
        public String thirdPartEmployeeId;

        @NameInMap("third_part_job_no")
        public String thirdPartJobNo;

        public static UserQueryResponseBodyModuleItems build(java.util.Map<String, ?> map) throws Exception {
            UserQueryResponseBodyModuleItems self = new UserQueryResponseBodyModuleItems();
            return TeaModel.build(map, self);
        }

        public UserQueryResponseBodyModuleItems setEmployeeNick(String employeeNick) {
            this.employeeNick = employeeNick;
            return this;
        }
        public String getEmployeeNick() {
            return this.employeeNick;
        }

        public UserQueryResponseBodyModuleItems setThirdPartEmployeeId(String thirdPartEmployeeId) {
            this.thirdPartEmployeeId = thirdPartEmployeeId;
            return this;
        }
        public String getThirdPartEmployeeId() {
            return this.thirdPartEmployeeId;
        }

        public UserQueryResponseBodyModuleItems setThirdPartJobNo(String thirdPartJobNo) {
            this.thirdPartJobNo = thirdPartJobNo;
            return this;
        }
        public String getThirdPartJobNo() {
            return this.thirdPartJobNo;
        }

    }

    public static class UserQueryResponseBodyModule extends TeaModel {
        @NameInMap("has_more")
        public Boolean hasMore;

        @NameInMap("items")
        public java.util.List<UserQueryResponseBodyModuleItems> items;

        @NameInMap("page_token")
        public String pageToken;

        @NameInMap("total")
        public Long total;

        public static UserQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            UserQueryResponseBodyModule self = new UserQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public UserQueryResponseBodyModule setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public UserQueryResponseBodyModule setItems(java.util.List<UserQueryResponseBodyModuleItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<UserQueryResponseBodyModuleItems> getItems() {
            return this.items;
        }

        public UserQueryResponseBodyModule setPageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }
        public String getPageToken() {
            return this.pageToken;
        }

        public UserQueryResponseBodyModule setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
