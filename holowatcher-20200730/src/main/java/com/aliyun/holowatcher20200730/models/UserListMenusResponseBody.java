// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UserListMenusResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<UserListMenusResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static UserListMenusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UserListMenusResponseBody self = new UserListMenusResponseBody();
        return TeaModel.build(map, self);
    }

    public UserListMenusResponseBody setData(java.util.List<UserListMenusResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<UserListMenusResponseBodyData> getData() {
        return this.data;
    }

    public UserListMenusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UserListMenusResponseBodyData extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        @NameInMap("Url")
        public String url;

        public static UserListMenusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UserListMenusResponseBodyData self = new UserListMenusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UserListMenusResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public UserListMenusResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public UserListMenusResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UserListMenusResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UserListMenusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UserListMenusResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
