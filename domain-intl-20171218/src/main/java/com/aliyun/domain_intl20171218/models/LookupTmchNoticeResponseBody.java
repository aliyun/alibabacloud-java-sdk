// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class LookupTmchNoticeResponseBody extends TeaModel {
    @NameInMap("Claims")
    public LookupTmchNoticeResponseBodyClaims claims;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Label")
    public String label;

    @NameInMap("NotAfter")
    public String notAfter;

    @NameInMap("NotBefore")
    public String notBefore;

    @NameInMap("RequestId")
    public String requestId;

    public static LookupTmchNoticeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LookupTmchNoticeResponseBody self = new LookupTmchNoticeResponseBody();
        return TeaModel.build(map, self);
    }

    public LookupTmchNoticeResponseBody setClaims(LookupTmchNoticeResponseBodyClaims claims) {
        this.claims = claims;
        return this;
    }
    public LookupTmchNoticeResponseBodyClaims getClaims() {
        return this.claims;
    }

    public LookupTmchNoticeResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public LookupTmchNoticeResponseBody setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public LookupTmchNoticeResponseBody setNotAfter(String notAfter) {
        this.notAfter = notAfter;
        return this;
    }
    public String getNotAfter() {
        return this.notAfter;
    }

    public LookupTmchNoticeResponseBody setNotBefore(String notBefore) {
        this.notBefore = notBefore;
        return this;
    }
    public String getNotBefore() {
        return this.notBefore;
    }

    public LookupTmchNoticeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class LookupTmchNoticeResponseBodyClaimsClaimClassDescsClassDesc extends TeaModel {
        @NameInMap("ClassNum")
        public Integer classNum;

        @NameInMap("Desc")
        public String desc;

        public static LookupTmchNoticeResponseBodyClaimsClaimClassDescsClassDesc build(java.util.Map<String, ?> map) throws Exception {
            LookupTmchNoticeResponseBodyClaimsClaimClassDescsClassDesc self = new LookupTmchNoticeResponseBodyClaimsClaimClassDescsClassDesc();
            return TeaModel.build(map, self);
        }

        public LookupTmchNoticeResponseBodyClaimsClaimClassDescsClassDesc setClassNum(Integer classNum) {
            this.classNum = classNum;
            return this;
        }
        public Integer getClassNum() {
            return this.classNum;
        }

        public LookupTmchNoticeResponseBodyClaimsClaimClassDescsClassDesc setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

    }

    public static class LookupTmchNoticeResponseBodyClaimsClaimClassDescs extends TeaModel {
        @NameInMap("ClassDesc")
        public java.util.List<LookupTmchNoticeResponseBodyClaimsClaimClassDescsClassDesc> classDesc;

        public static LookupTmchNoticeResponseBodyClaimsClaimClassDescs build(java.util.Map<String, ?> map) throws Exception {
            LookupTmchNoticeResponseBodyClaimsClaimClassDescs self = new LookupTmchNoticeResponseBodyClaimsClaimClassDescs();
            return TeaModel.build(map, self);
        }

        public LookupTmchNoticeResponseBodyClaimsClaimClassDescs setClassDesc(java.util.List<LookupTmchNoticeResponseBodyClaimsClaimClassDescsClassDesc> classDesc) {
            this.classDesc = classDesc;
            return this;
        }
        public java.util.List<LookupTmchNoticeResponseBodyClaimsClaimClassDescsClassDesc> getClassDesc() {
            return this.classDesc;
        }

    }

    public static class LookupTmchNoticeResponseBodyClaimsClaimContactsContactAddrStreet extends TeaModel {
        @NameInMap("Street")
        public java.util.List<String> street;

        public static LookupTmchNoticeResponseBodyClaimsClaimContactsContactAddrStreet build(java.util.Map<String, ?> map) throws Exception {
            LookupTmchNoticeResponseBodyClaimsClaimContactsContactAddrStreet self = new LookupTmchNoticeResponseBodyClaimsClaimContactsContactAddrStreet();
            return TeaModel.build(map, self);
        }

        public LookupTmchNoticeResponseBodyClaimsClaimContactsContactAddrStreet setStreet(java.util.List<String> street) {
            this.street = street;
            return this;
        }
        public java.util.List<String> getStreet() {
            return this.street;
        }

    }

    public static class LookupTmchNoticeResponseBodyClaimsClaimContactsContactAddr extends TeaModel {
        @NameInMap("Cc")
        public String cc;

        @NameInMap("City")
        public String city;

        @NameInMap("Pc")
        public String pc;

        @NameInMap("Sp")
        public String sp;

        @NameInMap("Street")
        public LookupTmchNoticeResponseBodyClaimsClaimContactsContactAddrStreet street;

        public static LookupTmchNoticeResponseBodyClaimsClaimContactsContactAddr build(java.util.Map<String, ?> map) throws Exception {
            LookupTmchNoticeResponseBodyClaimsClaimContactsContactAddr self = new LookupTmchNoticeResponseBodyClaimsClaimContactsContactAddr();
            return TeaModel.build(map, self);
        }

        public LookupTmchNoticeResponseBodyClaimsClaimContactsContactAddr setCc(String cc) {
            this.cc = cc;
            return this;
        }
        public String getCc() {
            return this.cc;
        }

        public LookupTmchNoticeResponseBodyClaimsClaimContactsContactAddr setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public LookupTmchNoticeResponseBodyClaimsClaimContactsContactAddr setPc(String pc) {
            this.pc = pc;
            return this;
        }
        public String getPc() {
            return this.pc;
        }

        public LookupTmchNoticeResponseBodyClaimsClaimContactsContactAddr setSp(String sp) {
            this.sp = sp;
            return this;
        }
        public String getSp() {
            return this.sp;
        }

        public LookupTmchNoticeResponseBodyClaimsClaimContactsContactAddr setStreet(LookupTmchNoticeResponseBodyClaimsClaimContactsContactAddrStreet street) {
            this.street = street;
            return this;
        }
        public LookupTmchNoticeResponseBodyClaimsClaimContactsContactAddrStreet getStreet() {
            return this.street;
        }

    }

    public static class LookupTmchNoticeResponseBodyClaimsClaimContactsContact extends TeaModel {
        @NameInMap("Addr")
        public LookupTmchNoticeResponseBodyClaimsClaimContactsContactAddr addr;

        @NameInMap("Email")
        public String email;

        @NameInMap("Fax")
        public String fax;

        @NameInMap("Name")
        public String name;

        @NameInMap("Org")
        public String org;

        @NameInMap("Type")
        public String type;

        @NameInMap("Voice")
        public String voice;

        public static LookupTmchNoticeResponseBodyClaimsClaimContactsContact build(java.util.Map<String, ?> map) throws Exception {
            LookupTmchNoticeResponseBodyClaimsClaimContactsContact self = new LookupTmchNoticeResponseBodyClaimsClaimContactsContact();
            return TeaModel.build(map, self);
        }

        public LookupTmchNoticeResponseBodyClaimsClaimContactsContact setAddr(LookupTmchNoticeResponseBodyClaimsClaimContactsContactAddr addr) {
            this.addr = addr;
            return this;
        }
        public LookupTmchNoticeResponseBodyClaimsClaimContactsContactAddr getAddr() {
            return this.addr;
        }

        public LookupTmchNoticeResponseBodyClaimsClaimContactsContact setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public LookupTmchNoticeResponseBodyClaimsClaimContactsContact setFax(String fax) {
            this.fax = fax;
            return this;
        }
        public String getFax() {
            return this.fax;
        }

        public LookupTmchNoticeResponseBodyClaimsClaimContactsContact setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public LookupTmchNoticeResponseBodyClaimsClaimContactsContact setOrg(String org) {
            this.org = org;
            return this;
        }
        public String getOrg() {
            return this.org;
        }

        public LookupTmchNoticeResponseBodyClaimsClaimContactsContact setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public LookupTmchNoticeResponseBodyClaimsClaimContactsContact setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

    }

    public static class LookupTmchNoticeResponseBodyClaimsClaimContacts extends TeaModel {
        @NameInMap("Contact")
        public java.util.List<LookupTmchNoticeResponseBodyClaimsClaimContactsContact> contact;

        public static LookupTmchNoticeResponseBodyClaimsClaimContacts build(java.util.Map<String, ?> map) throws Exception {
            LookupTmchNoticeResponseBodyClaimsClaimContacts self = new LookupTmchNoticeResponseBodyClaimsClaimContacts();
            return TeaModel.build(map, self);
        }

        public LookupTmchNoticeResponseBodyClaimsClaimContacts setContact(java.util.List<LookupTmchNoticeResponseBodyClaimsClaimContactsContact> contact) {
            this.contact = contact;
            return this;
        }
        public java.util.List<LookupTmchNoticeResponseBodyClaimsClaimContactsContact> getContact() {
            return this.contact;
        }

    }

    public static class LookupTmchNoticeResponseBodyClaimsClaimHoldersHolderAddrStreet extends TeaModel {
        @NameInMap("Street")
        public java.util.List<String> street;

        public static LookupTmchNoticeResponseBodyClaimsClaimHoldersHolderAddrStreet build(java.util.Map<String, ?> map) throws Exception {
            LookupTmchNoticeResponseBodyClaimsClaimHoldersHolderAddrStreet self = new LookupTmchNoticeResponseBodyClaimsClaimHoldersHolderAddrStreet();
            return TeaModel.build(map, self);
        }

        public LookupTmchNoticeResponseBodyClaimsClaimHoldersHolderAddrStreet setStreet(java.util.List<String> street) {
            this.street = street;
            return this;
        }
        public java.util.List<String> getStreet() {
            return this.street;
        }

    }

    public static class LookupTmchNoticeResponseBodyClaimsClaimHoldersHolderAddr extends TeaModel {
        @NameInMap("Cc")
        public String cc;

        @NameInMap("City")
        public String city;

        @NameInMap("Pc")
        public String pc;

        @NameInMap("Sp")
        public String sp;

        @NameInMap("Street")
        public LookupTmchNoticeResponseBodyClaimsClaimHoldersHolderAddrStreet street;

        public static LookupTmchNoticeResponseBodyClaimsClaimHoldersHolderAddr build(java.util.Map<String, ?> map) throws Exception {
            LookupTmchNoticeResponseBodyClaimsClaimHoldersHolderAddr self = new LookupTmchNoticeResponseBodyClaimsClaimHoldersHolderAddr();
            return TeaModel.build(map, self);
        }

        public LookupTmchNoticeResponseBodyClaimsClaimHoldersHolderAddr setCc(String cc) {
            this.cc = cc;
            return this;
        }
        public String getCc() {
            return this.cc;
        }

        public LookupTmchNoticeResponseBodyClaimsClaimHoldersHolderAddr setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public LookupTmchNoticeResponseBodyClaimsClaimHoldersHolderAddr setPc(String pc) {
            this.pc = pc;
            return this;
        }
        public String getPc() {
            return this.pc;
        }

        public LookupTmchNoticeResponseBodyClaimsClaimHoldersHolderAddr setSp(String sp) {
            this.sp = sp;
            return this;
        }
        public String getSp() {
            return this.sp;
        }

        public LookupTmchNoticeResponseBodyClaimsClaimHoldersHolderAddr setStreet(LookupTmchNoticeResponseBodyClaimsClaimHoldersHolderAddrStreet street) {
            this.street = street;
            return this;
        }
        public LookupTmchNoticeResponseBodyClaimsClaimHoldersHolderAddrStreet getStreet() {
            return this.street;
        }

    }

    public static class LookupTmchNoticeResponseBodyClaimsClaimHoldersHolder extends TeaModel {
        @NameInMap("Addr")
        public LookupTmchNoticeResponseBodyClaimsClaimHoldersHolderAddr addr;

        @NameInMap("Entitlement")
        public String entitlement;

        @NameInMap("Org")
        public String org;

        public static LookupTmchNoticeResponseBodyClaimsClaimHoldersHolder build(java.util.Map<String, ?> map) throws Exception {
            LookupTmchNoticeResponseBodyClaimsClaimHoldersHolder self = new LookupTmchNoticeResponseBodyClaimsClaimHoldersHolder();
            return TeaModel.build(map, self);
        }

        public LookupTmchNoticeResponseBodyClaimsClaimHoldersHolder setAddr(LookupTmchNoticeResponseBodyClaimsClaimHoldersHolderAddr addr) {
            this.addr = addr;
            return this;
        }
        public LookupTmchNoticeResponseBodyClaimsClaimHoldersHolderAddr getAddr() {
            return this.addr;
        }

        public LookupTmchNoticeResponseBodyClaimsClaimHoldersHolder setEntitlement(String entitlement) {
            this.entitlement = entitlement;
            return this;
        }
        public String getEntitlement() {
            return this.entitlement;
        }

        public LookupTmchNoticeResponseBodyClaimsClaimHoldersHolder setOrg(String org) {
            this.org = org;
            return this;
        }
        public String getOrg() {
            return this.org;
        }

    }

    public static class LookupTmchNoticeResponseBodyClaimsClaimHolders extends TeaModel {
        @NameInMap("Holder")
        public java.util.List<LookupTmchNoticeResponseBodyClaimsClaimHoldersHolder> holder;

        public static LookupTmchNoticeResponseBodyClaimsClaimHolders build(java.util.Map<String, ?> map) throws Exception {
            LookupTmchNoticeResponseBodyClaimsClaimHolders self = new LookupTmchNoticeResponseBodyClaimsClaimHolders();
            return TeaModel.build(map, self);
        }

        public LookupTmchNoticeResponseBodyClaimsClaimHolders setHolder(java.util.List<LookupTmchNoticeResponseBodyClaimsClaimHoldersHolder> holder) {
            this.holder = holder;
            return this;
        }
        public java.util.List<LookupTmchNoticeResponseBodyClaimsClaimHoldersHolder> getHolder() {
            return this.holder;
        }

    }

    public static class LookupTmchNoticeResponseBodyClaimsClaimJurDesc extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        @NameInMap("JurCC")
        public String jurCC;

        public static LookupTmchNoticeResponseBodyClaimsClaimJurDesc build(java.util.Map<String, ?> map) throws Exception {
            LookupTmchNoticeResponseBodyClaimsClaimJurDesc self = new LookupTmchNoticeResponseBodyClaimsClaimJurDesc();
            return TeaModel.build(map, self);
        }

        public LookupTmchNoticeResponseBodyClaimsClaimJurDesc setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public LookupTmchNoticeResponseBodyClaimsClaimJurDesc setJurCC(String jurCC) {
            this.jurCC = jurCC;
            return this;
        }
        public String getJurCC() {
            return this.jurCC;
        }

    }

    public static class LookupTmchNoticeResponseBodyClaimsClaim extends TeaModel {
        @NameInMap("ClassDescs")
        public LookupTmchNoticeResponseBodyClaimsClaimClassDescs classDescs;

        @NameInMap("Contacts")
        public LookupTmchNoticeResponseBodyClaimsClaimContacts contacts;

        @NameInMap("GoodsAndServices")
        public String goodsAndServices;

        @NameInMap("Holders")
        public LookupTmchNoticeResponseBodyClaimsClaimHolders holders;

        @NameInMap("JurDesc")
        public LookupTmchNoticeResponseBodyClaimsClaimJurDesc jurDesc;

        @NameInMap("MarkName")
        public String markName;

        public static LookupTmchNoticeResponseBodyClaimsClaim build(java.util.Map<String, ?> map) throws Exception {
            LookupTmchNoticeResponseBodyClaimsClaim self = new LookupTmchNoticeResponseBodyClaimsClaim();
            return TeaModel.build(map, self);
        }

        public LookupTmchNoticeResponseBodyClaimsClaim setClassDescs(LookupTmchNoticeResponseBodyClaimsClaimClassDescs classDescs) {
            this.classDescs = classDescs;
            return this;
        }
        public LookupTmchNoticeResponseBodyClaimsClaimClassDescs getClassDescs() {
            return this.classDescs;
        }

        public LookupTmchNoticeResponseBodyClaimsClaim setContacts(LookupTmchNoticeResponseBodyClaimsClaimContacts contacts) {
            this.contacts = contacts;
            return this;
        }
        public LookupTmchNoticeResponseBodyClaimsClaimContacts getContacts() {
            return this.contacts;
        }

        public LookupTmchNoticeResponseBodyClaimsClaim setGoodsAndServices(String goodsAndServices) {
            this.goodsAndServices = goodsAndServices;
            return this;
        }
        public String getGoodsAndServices() {
            return this.goodsAndServices;
        }

        public LookupTmchNoticeResponseBodyClaimsClaim setHolders(LookupTmchNoticeResponseBodyClaimsClaimHolders holders) {
            this.holders = holders;
            return this;
        }
        public LookupTmchNoticeResponseBodyClaimsClaimHolders getHolders() {
            return this.holders;
        }

        public LookupTmchNoticeResponseBodyClaimsClaim setJurDesc(LookupTmchNoticeResponseBodyClaimsClaimJurDesc jurDesc) {
            this.jurDesc = jurDesc;
            return this;
        }
        public LookupTmchNoticeResponseBodyClaimsClaimJurDesc getJurDesc() {
            return this.jurDesc;
        }

        public LookupTmchNoticeResponseBodyClaimsClaim setMarkName(String markName) {
            this.markName = markName;
            return this;
        }
        public String getMarkName() {
            return this.markName;
        }

    }

    public static class LookupTmchNoticeResponseBodyClaims extends TeaModel {
        @NameInMap("Claim")
        public java.util.List<LookupTmchNoticeResponseBodyClaimsClaim> claim;

        public static LookupTmchNoticeResponseBodyClaims build(java.util.Map<String, ?> map) throws Exception {
            LookupTmchNoticeResponseBodyClaims self = new LookupTmchNoticeResponseBodyClaims();
            return TeaModel.build(map, self);
        }

        public LookupTmchNoticeResponseBodyClaims setClaim(java.util.List<LookupTmchNoticeResponseBodyClaimsClaim> claim) {
            this.claim = claim;
            return this;
        }
        public java.util.List<LookupTmchNoticeResponseBodyClaimsClaim> getClaim() {
            return this.claim;
        }

    }

}
