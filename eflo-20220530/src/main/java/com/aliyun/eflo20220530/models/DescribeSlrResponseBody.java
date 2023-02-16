// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DescribeSlrResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public DescribeSlrResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSlrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlrResponseBody self = new DescribeSlrResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlrResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeSlrResponseBody setContent(DescribeSlrResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public DescribeSlrResponseBodyContent getContent() {
        return this.content;
    }

    public DescribeSlrResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSlrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSlrResponseBodyContent extends TeaModel {
        @NameInMap("HasRole")
        public Boolean hasRole;

        public static DescribeSlrResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlrResponseBodyContent self = new DescribeSlrResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DescribeSlrResponseBodyContent setHasRole(Boolean hasRole) {
            this.hasRole = hasRole;
            return this;
        }
        public Boolean getHasRole() {
            return this.hasRole;
        }

    }

}
