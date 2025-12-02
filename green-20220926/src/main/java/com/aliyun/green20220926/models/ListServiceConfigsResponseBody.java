// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListServiceConfigsResponseBody extends TeaModel {
    /**
     * <p>Error code.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListServiceConfigsResponseBodyData> data;

    /**
     * <p>Further description of the error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>ID assigned by the backend to uniquely identify a request. Can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Success indicator.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListServiceConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceConfigsResponseBody self = new ListServiceConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceConfigsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListServiceConfigsResponseBody setData(java.util.List<ListServiceConfigsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListServiceConfigsResponseBodyData> getData() {
        return this.data;
    }

    public ListServiceConfigsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ListServiceConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceConfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListServiceConfigsResponseBodyDataCustomServiceConfRulesImageScanRule extends TeaModel {
        /**
         * <p>Image services.</p>
         */
        @NameInMap("Services")
        public java.util.List<String> services;

        public static ListServiceConfigsResponseBodyDataCustomServiceConfRulesImageScanRule build(java.util.Map<String, ?> map) throws Exception {
            ListServiceConfigsResponseBodyDataCustomServiceConfRulesImageScanRule self = new ListServiceConfigsResponseBodyDataCustomServiceConfRulesImageScanRule();
            return TeaModel.build(map, self);
        }

        public ListServiceConfigsResponseBodyDataCustomServiceConfRulesImageScanRule setServices(java.util.List<String> services) {
            this.services = services;
            return this;
        }
        public java.util.List<String> getServices() {
            return this.services;
        }

    }

    public static class ListServiceConfigsResponseBodyDataCustomServiceConfRulesTextScanRule extends TeaModel {
        /**
         * <p>Text services.</p>
         */
        @NameInMap("Services")
        public java.util.List<String> services;

        public static ListServiceConfigsResponseBodyDataCustomServiceConfRulesTextScanRule build(java.util.Map<String, ?> map) throws Exception {
            ListServiceConfigsResponseBodyDataCustomServiceConfRulesTextScanRule self = new ListServiceConfigsResponseBodyDataCustomServiceConfRulesTextScanRule();
            return TeaModel.build(map, self);
        }

        public ListServiceConfigsResponseBodyDataCustomServiceConfRulesTextScanRule setServices(java.util.List<String> services) {
            this.services = services;
            return this;
        }
        public java.util.List<String> getServices() {
            return this.services;
        }

    }

    public static class ListServiceConfigsResponseBodyDataCustomServiceConfRules extends TeaModel {
        /**
         * <p>Image review rule.</p>
         */
        @NameInMap("ImageScanRule")
        public ListServiceConfigsResponseBodyDataCustomServiceConfRulesImageScanRule imageScanRule;

        /**
         * <p>Index.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>Text review rule.</p>
         */
        @NameInMap("TextScanRule")
        public ListServiceConfigsResponseBodyDataCustomServiceConfRulesTextScanRule textScanRule;

        public static ListServiceConfigsResponseBodyDataCustomServiceConfRules build(java.util.Map<String, ?> map) throws Exception {
            ListServiceConfigsResponseBodyDataCustomServiceConfRules self = new ListServiceConfigsResponseBodyDataCustomServiceConfRules();
            return TeaModel.build(map, self);
        }

        public ListServiceConfigsResponseBodyDataCustomServiceConfRules setImageScanRule(ListServiceConfigsResponseBodyDataCustomServiceConfRulesImageScanRule imageScanRule) {
            this.imageScanRule = imageScanRule;
            return this;
        }
        public ListServiceConfigsResponseBodyDataCustomServiceConfRulesImageScanRule getImageScanRule() {
            return this.imageScanRule;
        }

        public ListServiceConfigsResponseBodyDataCustomServiceConfRules setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListServiceConfigsResponseBodyDataCustomServiceConfRules setTextScanRule(ListServiceConfigsResponseBodyDataCustomServiceConfRulesTextScanRule textScanRule) {
            this.textScanRule = textScanRule;
            return this;
        }
        public ListServiceConfigsResponseBodyDataCustomServiceConfRulesTextScanRule getTextScanRule() {
            return this.textScanRule;
        }

    }

    public static class ListServiceConfigsResponseBodyDataCustomServiceConf extends TeaModel {
        /**
         * <p>Audio service.</p>
         * 
         * <strong>example:</strong>
         * <p>audio_media_detection</p>
         */
        @NameInMap("AudioService")
        public String audioService;

        /**
         * <p>Image services.</p>
         */
        @NameInMap("ImageService")
        public java.util.List<String> imageService;

        /**
         * <p>Ignored word libraries.</p>
         */
        @NameInMap("KeywordFilterLibs")
        public java.util.List<String> keywordFilterLibs;

        /**
         * <p>Hit word libraries.</p>
         */
        @NameInMap("KeywordHitLibs")
        public java.util.List<String> keywordHitLibs;

        /**
         * <p>Service rules</p>
         */
        @NameInMap("Rules")
        public java.util.List<ListServiceConfigsResponseBodyDataCustomServiceConfRules> rules;

        /**
         * <p>Hit similar text libraries.</p>
         */
        @NameInMap("SimilarTextHitLibs")
        public java.util.List<String> similarTextHitLibs;

        public static ListServiceConfigsResponseBodyDataCustomServiceConf build(java.util.Map<String, ?> map) throws Exception {
            ListServiceConfigsResponseBodyDataCustomServiceConf self = new ListServiceConfigsResponseBodyDataCustomServiceConf();
            return TeaModel.build(map, self);
        }

        public ListServiceConfigsResponseBodyDataCustomServiceConf setAudioService(String audioService) {
            this.audioService = audioService;
            return this;
        }
        public String getAudioService() {
            return this.audioService;
        }

        public ListServiceConfigsResponseBodyDataCustomServiceConf setImageService(java.util.List<String> imageService) {
            this.imageService = imageService;
            return this;
        }
        public java.util.List<String> getImageService() {
            return this.imageService;
        }

        public ListServiceConfigsResponseBodyDataCustomServiceConf setKeywordFilterLibs(java.util.List<String> keywordFilterLibs) {
            this.keywordFilterLibs = keywordFilterLibs;
            return this;
        }
        public java.util.List<String> getKeywordFilterLibs() {
            return this.keywordFilterLibs;
        }

        public ListServiceConfigsResponseBodyDataCustomServiceConf setKeywordHitLibs(java.util.List<String> keywordHitLibs) {
            this.keywordHitLibs = keywordHitLibs;
            return this;
        }
        public java.util.List<String> getKeywordHitLibs() {
            return this.keywordHitLibs;
        }

        public ListServiceConfigsResponseBodyDataCustomServiceConf setRules(java.util.List<ListServiceConfigsResponseBodyDataCustomServiceConfRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<ListServiceConfigsResponseBodyDataCustomServiceConfRules> getRules() {
            return this.rules;
        }

        public ListServiceConfigsResponseBodyDataCustomServiceConf setSimilarTextHitLibs(java.util.List<String> similarTextHitLibs) {
            this.similarTextHitLibs = similarTextHitLibs;
            return this;
        }
        public java.util.List<String> getSimilarTextHitLibs() {
            return this.similarTextHitLibs;
        }

    }

    public static class ListServiceConfigsResponseBodyData extends TeaModel {
        /**
         * <p>Category.</p>
         * 
         * <strong>example:</strong>
         * <p>guard-scene</p>
         */
        @NameInMap("Classify")
        public String classify;

        /**
         * <p>Main service.</p>
         * 
         * <strong>example:</strong>
         * <p>nickname_detection</p>
         */
        @NameInMap("CopyFrom")
        public String copyFrom;

        /**
         * <p>Service configuration.</p>
         */
        @NameInMap("CustomServiceConf")
        public ListServiceConfigsResponseBodyDataCustomServiceConf customServiceConf;

        /**
         * <p>Modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-07-11 15:40:04</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Options.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Option")
        public java.util.Map<String, ?> option;

        /**
         * <p>Resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>Service code.</p>
         * 
         * <strong>example:</strong>
         * <p>nickname_detection</p>
         */
        @NameInMap("ServiceCode")
        public String serviceCode;

        /**
         * <p>Service description.</p>
         * 
         * <strong>example:</strong>
         * <p>服务描述</p>
         */
        @NameInMap("ServiceDesc")
        public String serviceDesc;

        /**
         * <p>Service name.</p>
         * 
         * <strong>example:</strong>
         * <p>服务名称</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>Service type.</p>
         * 
         * <strong>example:</strong>
         * <p>plus</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>UID.</p>
         * 
         * <strong>example:</strong>
         * <p>1674*****0071291</p>
         */
        @NameInMap("Uid")
        public String uid;

        /**
         * <p>Usage status</p>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
        @NameInMap("UseStatus")
        public String useStatus;

        public static ListServiceConfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListServiceConfigsResponseBodyData self = new ListServiceConfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListServiceConfigsResponseBodyData setClassify(String classify) {
            this.classify = classify;
            return this;
        }
        public String getClassify() {
            return this.classify;
        }

        public ListServiceConfigsResponseBodyData setCopyFrom(String copyFrom) {
            this.copyFrom = copyFrom;
            return this;
        }
        public String getCopyFrom() {
            return this.copyFrom;
        }

        public ListServiceConfigsResponseBodyData setCustomServiceConf(ListServiceConfigsResponseBodyDataCustomServiceConf customServiceConf) {
            this.customServiceConf = customServiceConf;
            return this;
        }
        public ListServiceConfigsResponseBodyDataCustomServiceConf getCustomServiceConf() {
            return this.customServiceConf;
        }

        public ListServiceConfigsResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListServiceConfigsResponseBodyData setOption(java.util.Map<String, ?> option) {
            this.option = option;
            return this;
        }
        public java.util.Map<String, ?> getOption() {
            return this.option;
        }

        public ListServiceConfigsResponseBodyData setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListServiceConfigsResponseBodyData setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public ListServiceConfigsResponseBodyData setServiceDesc(String serviceDesc) {
            this.serviceDesc = serviceDesc;
            return this;
        }
        public String getServiceDesc() {
            return this.serviceDesc;
        }

        public ListServiceConfigsResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListServiceConfigsResponseBodyData setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListServiceConfigsResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListServiceConfigsResponseBodyData setUseStatus(String useStatus) {
            this.useStatus = useStatus;
            return this;
        }
        public String getUseStatus() {
            return this.useStatus;
        }

    }

}
