// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AllBaseCityInfoQueryResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public AllBaseCityInfoQueryResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    // traceId
    @NameInMap("traceId")
    public String traceId;

    public static AllBaseCityInfoQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllBaseCityInfoQueryResponseBody self = new AllBaseCityInfoQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public AllBaseCityInfoQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AllBaseCityInfoQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AllBaseCityInfoQueryResponseBody setModule(AllBaseCityInfoQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public AllBaseCityInfoQueryResponseBodyModule getModule() {
        return this.module;
    }

    public AllBaseCityInfoQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AllBaseCityInfoQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AllBaseCityInfoQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class AllBaseCityInfoQueryResponseBodyModuleAllCityBaseInfoList extends TeaModel {
        @NameInMap("adcode")
        public String adcode;

        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_level")
        public String cityLevel;

        @NameInMap("city_name")
        public String cityName;

        @NameInMap("cn_name_tree")
        public String cnNameTree;

        @NameInMap("id")
        public Long id;

        @NameInMap("other_name_list")
        public java.util.List<String> otherNameList;

        public static AllBaseCityInfoQueryResponseBodyModuleAllCityBaseInfoList build(java.util.Map<String, ?> map) throws Exception {
            AllBaseCityInfoQueryResponseBodyModuleAllCityBaseInfoList self = new AllBaseCityInfoQueryResponseBodyModuleAllCityBaseInfoList();
            return TeaModel.build(map, self);
        }

        public AllBaseCityInfoQueryResponseBodyModuleAllCityBaseInfoList setAdcode(String adcode) {
            this.adcode = adcode;
            return this;
        }
        public String getAdcode() {
            return this.adcode;
        }

        public AllBaseCityInfoQueryResponseBodyModuleAllCityBaseInfoList setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public AllBaseCityInfoQueryResponseBodyModuleAllCityBaseInfoList setCityLevel(String cityLevel) {
            this.cityLevel = cityLevel;
            return this;
        }
        public String getCityLevel() {
            return this.cityLevel;
        }

        public AllBaseCityInfoQueryResponseBodyModuleAllCityBaseInfoList setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public AllBaseCityInfoQueryResponseBodyModuleAllCityBaseInfoList setCnNameTree(String cnNameTree) {
            this.cnNameTree = cnNameTree;
            return this;
        }
        public String getCnNameTree() {
            return this.cnNameTree;
        }

        public AllBaseCityInfoQueryResponseBodyModuleAllCityBaseInfoList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public AllBaseCityInfoQueryResponseBodyModuleAllCityBaseInfoList setOtherNameList(java.util.List<String> otherNameList) {
            this.otherNameList = otherNameList;
            return this;
        }
        public java.util.List<String> getOtherNameList() {
            return this.otherNameList;
        }

    }

    public static class AllBaseCityInfoQueryResponseBodyModule extends TeaModel {
        @NameInMap("all_city_base_info_list")
        public java.util.List<AllBaseCityInfoQueryResponseBodyModuleAllCityBaseInfoList> allCityBaseInfoList;

        public static AllBaseCityInfoQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            AllBaseCityInfoQueryResponseBodyModule self = new AllBaseCityInfoQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public AllBaseCityInfoQueryResponseBodyModule setAllCityBaseInfoList(java.util.List<AllBaseCityInfoQueryResponseBodyModuleAllCityBaseInfoList> allCityBaseInfoList) {
            this.allCityBaseInfoList = allCityBaseInfoList;
            return this;
        }
        public java.util.List<AllBaseCityInfoQueryResponseBodyModuleAllCityBaseInfoList> getAllCityBaseInfoList() {
            return this.allCityBaseInfoList;
        }

    }

}
