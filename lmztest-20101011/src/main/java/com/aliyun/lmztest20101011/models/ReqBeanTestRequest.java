// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class ReqBeanTestRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("codes")
    public java.util.List<String> codes;

    @NameInMap("nums")
    public java.util.List<Long> nums;

    @NameInMap("users")
    public java.util.List<ReqBeanTestRequestUsers> users;

    public static ReqBeanTestRequest build(java.util.Map<String, ?> map) throws Exception {
        ReqBeanTestRequest self = new ReqBeanTestRequest();
        return TeaModel.build(map, self);
    }

    public ReqBeanTestRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ReqBeanTestRequest setCodes(java.util.List<String> codes) {
        this.codes = codes;
        return this;
    }
    public java.util.List<String> getCodes() {
        return this.codes;
    }

    public ReqBeanTestRequest setNums(java.util.List<Long> nums) {
        this.nums = nums;
        return this;
    }
    public java.util.List<Long> getNums() {
        return this.nums;
    }

    public ReqBeanTestRequest setUsers(java.util.List<ReqBeanTestRequestUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<ReqBeanTestRequestUsers> getUsers() {
        return this.users;
    }

    public static class ReqBeanTestRequestUsers extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        public static ReqBeanTestRequestUsers build(java.util.Map<String, ?> map) throws Exception {
            ReqBeanTestRequestUsers self = new ReqBeanTestRequestUsers();
            return TeaModel.build(map, self);
        }

        public ReqBeanTestRequestUsers setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ReqBeanTestRequestUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
