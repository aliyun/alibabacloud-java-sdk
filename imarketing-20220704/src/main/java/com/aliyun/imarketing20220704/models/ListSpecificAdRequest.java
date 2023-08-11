// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class ListSpecificAdRequest extends TeaModel {
    /**
     * <p>app</p>
     */
    @NameInMap("App")
    public ListSpecificAdRequestApp app;

    @NameInMap("Ext")
    public java.util.Map<String, ?> ext;

    /**
     * <p>id</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>imp</p>
     */
    @NameInMap("Imp")
    public java.util.List<ListSpecificAdRequestImp> imp;

    /**
     * <p>user</p>
     */
    @NameInMap("User")
    public ListSpecificAdRequestUser user;

    @NameInMap("Verifyad")
    public java.util.List<ListSpecificAdRequestVerifyad> verifyad;

    public static ListSpecificAdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSpecificAdRequest self = new ListSpecificAdRequest();
        return TeaModel.build(map, self);
    }

    public ListSpecificAdRequest setApp(ListSpecificAdRequestApp app) {
        this.app = app;
        return this;
    }
    public ListSpecificAdRequestApp getApp() {
        return this.app;
    }

    public ListSpecificAdRequest setExt(java.util.Map<String, ?> ext) {
        this.ext = ext;
        return this;
    }
    public java.util.Map<String, ?> getExt() {
        return this.ext;
    }

    public ListSpecificAdRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListSpecificAdRequest setImp(java.util.List<ListSpecificAdRequestImp> imp) {
        this.imp = imp;
        return this;
    }
    public java.util.List<ListSpecificAdRequestImp> getImp() {
        return this.imp;
    }

    public ListSpecificAdRequest setUser(ListSpecificAdRequestUser user) {
        this.user = user;
        return this;
    }
    public ListSpecificAdRequestUser getUser() {
        return this.user;
    }

    public ListSpecificAdRequest setVerifyad(java.util.List<ListSpecificAdRequestVerifyad> verifyad) {
        this.verifyad = verifyad;
        return this;
    }
    public java.util.List<ListSpecificAdRequestVerifyad> getVerifyad() {
        return this.verifyad;
    }

    public static class ListSpecificAdRequestApp extends TeaModel {
        /**
         * <p>ext</p>
         */
        @NameInMap("Ext")
        public java.util.Map<String, ?> ext;

        /**
         * <p>mediaid</p>
         */
        @NameInMap("Mediaid")
        public String mediaid;

        /**
         * <p>sn</p>
         */
        @NameInMap("Sn")
        public String sn;

        public static ListSpecificAdRequestApp build(java.util.Map<String, ?> map) throws Exception {
            ListSpecificAdRequestApp self = new ListSpecificAdRequestApp();
            return TeaModel.build(map, self);
        }

        public ListSpecificAdRequestApp setExt(java.util.Map<String, ?> ext) {
            this.ext = ext;
            return this;
        }
        public java.util.Map<String, ?> getExt() {
            return this.ext;
        }

        public ListSpecificAdRequestApp setMediaid(String mediaid) {
            this.mediaid = mediaid;
            return this;
        }
        public String getMediaid() {
            return this.mediaid;
        }

        public ListSpecificAdRequestApp setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

    }

    public static class ListSpecificAdRequestImp extends TeaModel {
        /**
         * <p>id</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>tagid</p>
         */
        @NameInMap("Tagid")
        public String tagid;

        public static ListSpecificAdRequestImp build(java.util.Map<String, ?> map) throws Exception {
            ListSpecificAdRequestImp self = new ListSpecificAdRequestImp();
            return TeaModel.build(map, self);
        }

        public ListSpecificAdRequestImp setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSpecificAdRequestImp setTagid(String tagid) {
            this.tagid = tagid;
            return this;
        }
        public String getTagid() {
            return this.tagid;
        }

    }

    public static class ListSpecificAdRequestUser extends TeaModel {
        /**
         * <p>uid</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>uidtype</p>
         */
        @NameInMap("Usertype")
        public String usertype;

        public static ListSpecificAdRequestUser build(java.util.Map<String, ?> map) throws Exception {
            ListSpecificAdRequestUser self = new ListSpecificAdRequestUser();
            return TeaModel.build(map, self);
        }

        public ListSpecificAdRequestUser setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSpecificAdRequestUser setUsertype(String usertype) {
            this.usertype = usertype;
            return this;
        }
        public String getUsertype() {
            return this.usertype;
        }

    }

    public static class ListSpecificAdRequestVerifyad extends TeaModel {
        /**
         * <p>id</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Itemid")
        public String itemid;

        @NameInMap("Marketingtype")
        public String marketingtype;

        @NameInMap("Seat")
        public String seat;

        public static ListSpecificAdRequestVerifyad build(java.util.Map<String, ?> map) throws Exception {
            ListSpecificAdRequestVerifyad self = new ListSpecificAdRequestVerifyad();
            return TeaModel.build(map, self);
        }

        public ListSpecificAdRequestVerifyad setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSpecificAdRequestVerifyad setItemid(String itemid) {
            this.itemid = itemid;
            return this;
        }
        public String getItemid() {
            return this.itemid;
        }

        public ListSpecificAdRequestVerifyad setMarketingtype(String marketingtype) {
            this.marketingtype = marketingtype;
            return this;
        }
        public String getMarketingtype() {
            return this.marketingtype;
        }

        public ListSpecificAdRequestVerifyad setSeat(String seat) {
            this.seat = seat;
            return this;
        }
        public String getSeat() {
            return this.seat;
        }

    }

}
