// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class School extends TeaModel {
    @NameInMap("aa")
    public java.util.Map<String, String> aa;

    @NameInMap("cccs")
    public java.util.Map<String, String> cccs;

    @NameInMap("csdcfd")
    public java.util.List<java.util.List<String>> csdcfd;

    @NameInMap("da")
    public String da;

    @NameInMap("dds")
    public SchoolDds dds;

    @NameInMap("ddw")
    public java.util.List<String> ddw;

    public static School build(java.util.Map<String, ?> map) throws Exception {
        School self = new School();
        return TeaModel.build(map, self);
    }

    public School setAa(java.util.Map<String, String> aa) {
        this.aa = aa;
        return this;
    }
    public java.util.Map<String, String> getAa() {
        return this.aa;
    }

    public School setCccs(java.util.Map<String, String> cccs) {
        this.cccs = cccs;
        return this;
    }
    public java.util.Map<String, String> getCccs() {
        return this.cccs;
    }

    public School setCsdcfd(java.util.List<java.util.List<String>> csdcfd) {
        this.csdcfd = csdcfd;
        return this;
    }
    public java.util.List<java.util.List<String>> getCsdcfd() {
        return this.csdcfd;
    }

    public School setDa(String da) {
        this.da = da;
        return this;
    }
    public String getDa() {
        return this.da;
    }

    public School setDds(SchoolDds dds) {
        this.dds = dds;
        return this;
    }
    public SchoolDds getDds() {
        return this.dds;
    }

    public School setDdw(java.util.List<String> ddw) {
        this.ddw = ddw;
        return this;
    }
    public java.util.List<String> getDdw() {
        return this.ddw;
    }

    public static class SchoolDds extends TeaModel {
        @NameInMap("e")
        public String e;

        public static SchoolDds build(java.util.Map<String, ?> map) throws Exception {
            SchoolDds self = new SchoolDds();
            return TeaModel.build(map, self);
        }

        public SchoolDds setE(String e) {
            this.e = e;
            return this;
        }
        public String getE() {
            return this.e;
        }

    }

}
