// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelSuggestResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public HotelSuggestResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>A5009956-1077-52FB-B520-EA8C7E91D722</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static HotelSuggestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HotelSuggestResponseBody self = new HotelSuggestResponseBody();
        return TeaModel.build(map, self);
    }

    public HotelSuggestResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HotelSuggestResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HotelSuggestResponseBody setModule(HotelSuggestResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public HotelSuggestResponseBodyModule getModule() {
        return this.module;
    }

    public HotelSuggestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HotelSuggestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public HotelSuggestResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class HotelSuggestResponseBodyModulePopularSuggestInfosPopularInfos extends TeaModel {
        @NameInMap("display_name")
        public String displayName;

        public static HotelSuggestResponseBodyModulePopularSuggestInfosPopularInfos build(java.util.Map<String, ?> map) throws Exception {
            HotelSuggestResponseBodyModulePopularSuggestInfosPopularInfos self = new HotelSuggestResponseBodyModulePopularSuggestInfosPopularInfos();
            return TeaModel.build(map, self);
        }

        public HotelSuggestResponseBodyModulePopularSuggestInfosPopularInfos setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

    }

    public static class HotelSuggestResponseBodyModulePopularSuggestInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://gw.alicdn.com/imgextra/i1/O1CN01bwXBj71paiJolualE_!!6000000005377-2-tps-54-54.png">https://gw.alicdn.com/imgextra/i1/O1CN01bwXBj71paiJolualE_!!6000000005377-2-tps-54-54.png</a></p>
         */
        @NameInMap("icon")
        public String icon;

        @NameInMap("popular_infos")
        public java.util.List<HotelSuggestResponseBodyModulePopularSuggestInfosPopularInfos> popularInfos;

        @NameInMap("title")
        public String title;

        public static HotelSuggestResponseBodyModulePopularSuggestInfos build(java.util.Map<String, ?> map) throws Exception {
            HotelSuggestResponseBodyModulePopularSuggestInfos self = new HotelSuggestResponseBodyModulePopularSuggestInfos();
            return TeaModel.build(map, self);
        }

        public HotelSuggestResponseBodyModulePopularSuggestInfos setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public HotelSuggestResponseBodyModulePopularSuggestInfos setPopularInfos(java.util.List<HotelSuggestResponseBodyModulePopularSuggestInfosPopularInfos> popularInfos) {
            this.popularInfos = popularInfos;
            return this;
        }
        public java.util.List<HotelSuggestResponseBodyModulePopularSuggestInfosPopularInfos> getPopularInfos() {
            return this.popularInfos;
        }

        public HotelSuggestResponseBodyModulePopularSuggestInfos setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class HotelSuggestResponseBodyModule extends TeaModel {
        @NameInMap("guess_suggest_infos")
        public java.util.List<KeywordSuggestInfo> guessSuggestInfos;

        @NameInMap("keyword_suggest_infos")
        public java.util.List<KeywordSuggestInfo> keywordSuggestInfos;

        @NameInMap("popular_suggest_infos")
        public java.util.List<HotelSuggestResponseBodyModulePopularSuggestInfos> popularSuggestInfos;

        @NameInMap("tips")
        public String tips;

        public static HotelSuggestResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            HotelSuggestResponseBodyModule self = new HotelSuggestResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public HotelSuggestResponseBodyModule setGuessSuggestInfos(java.util.List<KeywordSuggestInfo> guessSuggestInfos) {
            this.guessSuggestInfos = guessSuggestInfos;
            return this;
        }
        public java.util.List<KeywordSuggestInfo> getGuessSuggestInfos() {
            return this.guessSuggestInfos;
        }

        public HotelSuggestResponseBodyModule setKeywordSuggestInfos(java.util.List<KeywordSuggestInfo> keywordSuggestInfos) {
            this.keywordSuggestInfos = keywordSuggestInfos;
            return this;
        }
        public java.util.List<KeywordSuggestInfo> getKeywordSuggestInfos() {
            return this.keywordSuggestInfos;
        }

        public HotelSuggestResponseBodyModule setPopularSuggestInfos(java.util.List<HotelSuggestResponseBodyModulePopularSuggestInfos> popularSuggestInfos) {
            this.popularSuggestInfos = popularSuggestInfos;
            return this;
        }
        public java.util.List<HotelSuggestResponseBodyModulePopularSuggestInfos> getPopularSuggestInfos() {
            return this.popularSuggestInfos;
        }

        public HotelSuggestResponseBodyModule setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

    }

}
