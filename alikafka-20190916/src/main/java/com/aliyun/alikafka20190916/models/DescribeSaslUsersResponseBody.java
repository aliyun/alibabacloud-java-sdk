// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DescribeSaslUsersResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("SaslUserList")
    public DescribeSaslUsersResponseBodySaslUserList saslUserList;

    public static DescribeSaslUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSaslUsersResponseBody self = new DescribeSaslUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSaslUsersResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeSaslUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSaslUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSaslUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeSaslUsersResponseBody setSaslUserList(DescribeSaslUsersResponseBodySaslUserList saslUserList) {
        this.saslUserList = saslUserList;
        return this;
    }
    public DescribeSaslUsersResponseBodySaslUserList getSaslUserList() {
        return this.saslUserList;
    }

    public static class DescribeSaslUsersResponseBodySaslUserListSaslUserVO extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Password")
        public String password;

        @NameInMap("Username")
        public String username;

        public static DescribeSaslUsersResponseBodySaslUserListSaslUserVO build(java.util.Map<String, ?> map) throws Exception {
            DescribeSaslUsersResponseBodySaslUserListSaslUserVO self = new DescribeSaslUsersResponseBodySaslUserListSaslUserVO();
            return TeaModel.build(map, self);
        }

        public DescribeSaslUsersResponseBodySaslUserListSaslUserVO setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSaslUsersResponseBodySaslUserListSaslUserVO setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public DescribeSaslUsersResponseBodySaslUserListSaslUserVO setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class DescribeSaslUsersResponseBodySaslUserList extends TeaModel {
        @NameInMap("SaslUserVO")
        public java.util.List<DescribeSaslUsersResponseBodySaslUserListSaslUserVO> saslUserVO;

        public static DescribeSaslUsersResponseBodySaslUserList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSaslUsersResponseBodySaslUserList self = new DescribeSaslUsersResponseBodySaslUserList();
            return TeaModel.build(map, self);
        }

        public DescribeSaslUsersResponseBodySaslUserList setSaslUserVO(java.util.List<DescribeSaslUsersResponseBodySaslUserListSaslUserVO> saslUserVO) {
            this.saslUserVO = saslUserVO;
            return this;
        }
        public java.util.List<DescribeSaslUsersResponseBodySaslUserListSaslUserVO> getSaslUserVO() {
            return this.saslUserVO;
        }

    }

}
