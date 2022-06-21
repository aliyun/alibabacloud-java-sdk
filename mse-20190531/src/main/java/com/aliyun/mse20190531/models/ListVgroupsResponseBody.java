// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListVgroupsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListVgroupsResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListVgroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVgroupsResponseBody self = new ListVgroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVgroupsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListVgroupsResponseBody setData(java.util.List<ListVgroupsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListVgroupsResponseBodyData> getData() {
        return this.data;
    }

    public ListVgroupsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListVgroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVgroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVgroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListVgroupsResponseBodyData extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NameServer")
        public String nameServer;

        @NameInMap("PrimaryUser")
        public String primaryUser;

        @NameInMap("Region")
        public String region;

        @NameInMap("SeataServerUniqueId")
        public String seataServerUniqueId;

        public static ListVgroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListVgroupsResponseBodyData self = new ListVgroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListVgroupsResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListVgroupsResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListVgroupsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListVgroupsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListVgroupsResponseBodyData setNameServer(String nameServer) {
            this.nameServer = nameServer;
            return this;
        }
        public String getNameServer() {
            return this.nameServer;
        }

        public ListVgroupsResponseBodyData setPrimaryUser(String primaryUser) {
            this.primaryUser = primaryUser;
            return this;
        }
        public String getPrimaryUser() {
            return this.primaryUser;
        }

        public ListVgroupsResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListVgroupsResponseBodyData setSeataServerUniqueId(String seataServerUniqueId) {
            this.seataServerUniqueId = seataServerUniqueId;
            return this;
        }
        public String getSeataServerUniqueId() {
            return this.seataServerUniqueId;
        }

    }

}
