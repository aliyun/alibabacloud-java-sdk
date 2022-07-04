// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class ListAdvertisingRequest extends TeaModel {
    // app
    @NameInMap("App")
    public ListAdvertisingRequestApp app;

    @NameInMap("Dealtype")
    public Integer dealtype;

    @NameInMap("Ext")
    public java.util.Map<String, ?> ext;

    // id
    @NameInMap("Id")
    public String id;

    // imp
    @NameInMap("Imp")
    public java.util.List<ListAdvertisingRequestImp> imp;

    // test
    @NameInMap("Test")
    public Integer test;

    // user
    @NameInMap("User")
    public ListAdvertisingRequestUser user;

    public static ListAdvertisingRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAdvertisingRequest self = new ListAdvertisingRequest();
        return TeaModel.build(map, self);
    }

    public ListAdvertisingRequest setApp(ListAdvertisingRequestApp app) {
        this.app = app;
        return this;
    }
    public ListAdvertisingRequestApp getApp() {
        return this.app;
    }

    public ListAdvertisingRequest setDealtype(Integer dealtype) {
        this.dealtype = dealtype;
        return this;
    }
    public Integer getDealtype() {
        return this.dealtype;
    }

    public ListAdvertisingRequest setExt(java.util.Map<String, ?> ext) {
        this.ext = ext;
        return this;
    }
    public java.util.Map<String, ?> getExt() {
        return this.ext;
    }

    public ListAdvertisingRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListAdvertisingRequest setImp(java.util.List<ListAdvertisingRequestImp> imp) {
        this.imp = imp;
        return this;
    }
    public java.util.List<ListAdvertisingRequestImp> getImp() {
        return this.imp;
    }

    public ListAdvertisingRequest setTest(Integer test) {
        this.test = test;
        return this;
    }
    public Integer getTest() {
        return this.test;
    }

    public ListAdvertisingRequest setUser(ListAdvertisingRequestUser user) {
        this.user = user;
        return this;
    }
    public ListAdvertisingRequestUser getUser() {
        return this.user;
    }

    public static class ListAdvertisingRequestApp extends TeaModel {
        @NameInMap("Ext")
        public java.util.Map<String, ?> ext;

        // mediaid
        @NameInMap("Mediaid")
        public String mediaid;

        // sn
        @NameInMap("Sn")
        public String sn;

        public static ListAdvertisingRequestApp build(java.util.Map<String, ?> map) throws Exception {
            ListAdvertisingRequestApp self = new ListAdvertisingRequestApp();
            return TeaModel.build(map, self);
        }

        public ListAdvertisingRequestApp setExt(java.util.Map<String, ?> ext) {
            this.ext = ext;
            return this;
        }
        public java.util.Map<String, ?> getExt() {
            return this.ext;
        }

        public ListAdvertisingRequestApp setMediaid(String mediaid) {
            this.mediaid = mediaid;
            return this;
        }
        public String getMediaid() {
            return this.mediaid;
        }

        public ListAdvertisingRequestApp setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

    }

    public static class ListAdvertisingRequestImp extends TeaModel {
        // id
        @NameInMap("Id")
        public String id;

        // tagid
        @NameInMap("Tagid")
        public String tagid;

        public static ListAdvertisingRequestImp build(java.util.Map<String, ?> map) throws Exception {
            ListAdvertisingRequestImp self = new ListAdvertisingRequestImp();
            return TeaModel.build(map, self);
        }

        public ListAdvertisingRequestImp setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAdvertisingRequestImp setTagid(String tagid) {
            this.tagid = tagid;
            return this;
        }
        public String getTagid() {
            return this.tagid;
        }

    }

    public static class ListAdvertisingRequestUser extends TeaModel {
        // uid
        @NameInMap("Id")
        public String id;

        // uidtype
        @NameInMap("Usertype")
        public String usertype;

        public static ListAdvertisingRequestUser build(java.util.Map<String, ?> map) throws Exception {
            ListAdvertisingRequestUser self = new ListAdvertisingRequestUser();
            return TeaModel.build(map, self);
        }

        public ListAdvertisingRequestUser setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAdvertisingRequestUser setUsertype(String usertype) {
            this.usertype = usertype;
            return this;
        }
        public String getUsertype() {
            return this.usertype;
        }

    }

}
