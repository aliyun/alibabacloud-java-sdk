// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeBizTypeSettingResponseBody extends TeaModel {
    @NameInMap("Ad")
    public DescribeBizTypeSettingResponseBodyAd ad;

    @NameInMap("Antispam")
    public DescribeBizTypeSettingResponseBodyAntispam antispam;

    @NameInMap("Live")
    public DescribeBizTypeSettingResponseBodyLive live;

    @NameInMap("Porn")
    public DescribeBizTypeSettingResponseBodyPorn porn;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Terrorism")
    public DescribeBizTypeSettingResponseBodyTerrorism terrorism;

    public static DescribeBizTypeSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBizTypeSettingResponseBody self = new DescribeBizTypeSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBizTypeSettingResponseBody setAd(DescribeBizTypeSettingResponseBodyAd ad) {
        this.ad = ad;
        return this;
    }
    public DescribeBizTypeSettingResponseBodyAd getAd() {
        return this.ad;
    }

    public DescribeBizTypeSettingResponseBody setAntispam(DescribeBizTypeSettingResponseBodyAntispam antispam) {
        this.antispam = antispam;
        return this;
    }
    public DescribeBizTypeSettingResponseBodyAntispam getAntispam() {
        return this.antispam;
    }

    public DescribeBizTypeSettingResponseBody setLive(DescribeBizTypeSettingResponseBodyLive live) {
        this.live = live;
        return this;
    }
    public DescribeBizTypeSettingResponseBodyLive getLive() {
        return this.live;
    }

    public DescribeBizTypeSettingResponseBody setPorn(DescribeBizTypeSettingResponseBodyPorn porn) {
        this.porn = porn;
        return this;
    }
    public DescribeBizTypeSettingResponseBodyPorn getPorn() {
        return this.porn;
    }

    public DescribeBizTypeSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBizTypeSettingResponseBody setTerrorism(DescribeBizTypeSettingResponseBodyTerrorism terrorism) {
        this.terrorism = terrorism;
        return this;
    }
    public DescribeBizTypeSettingResponseBodyTerrorism getTerrorism() {
        return this.terrorism;
    }

    public static class DescribeBizTypeSettingResponseBodyAd extends TeaModel {
        @NameInMap("Categories")
        public java.util.List<String> categories;

        public static DescribeBizTypeSettingResponseBodyAd build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizTypeSettingResponseBodyAd self = new DescribeBizTypeSettingResponseBodyAd();
            return TeaModel.build(map, self);
        }

        public DescribeBizTypeSettingResponseBodyAd setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

    }

    public static class DescribeBizTypeSettingResponseBodyAntispam extends TeaModel {
        @NameInMap("Categories")
        public java.util.List<String> categories;

        public static DescribeBizTypeSettingResponseBodyAntispam build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizTypeSettingResponseBodyAntispam self = new DescribeBizTypeSettingResponseBodyAntispam();
            return TeaModel.build(map, self);
        }

        public DescribeBizTypeSettingResponseBodyAntispam setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

    }

    public static class DescribeBizTypeSettingResponseBodyLive extends TeaModel {
        @NameInMap("Categories")
        public java.util.List<String> categories;

        public static DescribeBizTypeSettingResponseBodyLive build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizTypeSettingResponseBodyLive self = new DescribeBizTypeSettingResponseBodyLive();
            return TeaModel.build(map, self);
        }

        public DescribeBizTypeSettingResponseBodyLive setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

    }

    public static class DescribeBizTypeSettingResponseBodyPorn extends TeaModel {
        @NameInMap("Categories")
        public java.util.List<String> categories;

        public static DescribeBizTypeSettingResponseBodyPorn build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizTypeSettingResponseBodyPorn self = new DescribeBizTypeSettingResponseBodyPorn();
            return TeaModel.build(map, self);
        }

        public DescribeBizTypeSettingResponseBodyPorn setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

    }

    public static class DescribeBizTypeSettingResponseBodyTerrorism extends TeaModel {
        @NameInMap("Categories")
        public java.util.List<String> categories;

        public static DescribeBizTypeSettingResponseBodyTerrorism build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizTypeSettingResponseBodyTerrorism self = new DescribeBizTypeSettingResponseBodyTerrorism();
            return TeaModel.build(map, self);
        }

        public DescribeBizTypeSettingResponseBodyTerrorism setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

    }

}
