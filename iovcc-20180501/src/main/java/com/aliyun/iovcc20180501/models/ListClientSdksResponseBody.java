// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListClientSdksResponseBody extends TeaModel {
    @NameInMap("ClientSdks")
    public java.util.List<ListClientSdksResponseBodyClientSdks> clientSdks;

    @NameInMap("RequestId")
    public String requestId;

    public static ListClientSdksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClientSdksResponseBody self = new ListClientSdksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClientSdksResponseBody setClientSdks(java.util.List<ListClientSdksResponseBodyClientSdks> clientSdks) {
        this.clientSdks = clientSdks;
        return this;
    }
    public java.util.List<ListClientSdksResponseBodyClientSdks> getClientSdks() {
        return this.clientSdks;
    }

    public ListClientSdksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListClientSdksResponseBodyClientSdks extends TeaModel {
        @NameInMap("OsType")
        public Integer osType;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("PkgName")
        public String pkgName;

        @NameInMap("PkgType")
        public Integer pkgType;

        @NameInMap("Id")
        public Long id;

        public static ListClientSdksResponseBodyClientSdks build(java.util.Map<String, ?> map) throws Exception {
            ListClientSdksResponseBodyClientSdks self = new ListClientSdksResponseBodyClientSdks();
            return TeaModel.build(map, self);
        }

        public ListClientSdksResponseBodyClientSdks setOsType(Integer osType) {
            this.osType = osType;
            return this;
        }
        public Integer getOsType() {
            return this.osType;
        }

        public ListClientSdksResponseBodyClientSdks setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListClientSdksResponseBodyClientSdks setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListClientSdksResponseBodyClientSdks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClientSdksResponseBodyClientSdks setPkgName(String pkgName) {
            this.pkgName = pkgName;
            return this;
        }
        public String getPkgName() {
            return this.pkgName;
        }

        public ListClientSdksResponseBodyClientSdks setPkgType(Integer pkgType) {
            this.pkgType = pkgType;
            return this;
        }
        public Integer getPkgType() {
            return this.pkgType;
        }

        public ListClientSdksResponseBodyClientSdks setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
