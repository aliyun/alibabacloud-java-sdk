// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimStandardPlanResponseBody extends TeaModel {
    @NameInMap("Datas")
    public GetBimStandardPlanResponseBodyDatas datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBimStandardPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBimStandardPlanResponseBody self = new GetBimStandardPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBimStandardPlanResponseBody setDatas(GetBimStandardPlanResponseBodyDatas datas) {
        this.datas = datas;
        return this;
    }
    public GetBimStandardPlanResponseBodyDatas getDatas() {
        return this.datas;
    }

    public GetBimStandardPlanResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public GetBimStandardPlanResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetBimStandardPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBimStandardPlanResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBimStandardPlanResponseBodyDatasConfigMapInfoList extends TeaModel {
        // 图层id
        @NameInMap("Id")
        public Long id;

        // 图层名
        @NameInMap("Name")
        public String name;

        public static GetBimStandardPlanResponseBodyDatasConfigMapInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetBimStandardPlanResponseBodyDatasConfigMapInfoList self = new GetBimStandardPlanResponseBodyDatasConfigMapInfoList();
            return TeaModel.build(map, self);
        }

        public GetBimStandardPlanResponseBodyDatasConfigMapInfoList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBimStandardPlanResponseBodyDatasConfigMapInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetBimStandardPlanResponseBodyDatasConfigMapInfo extends TeaModel {
        // 图层归类名
        @NameInMap("Layer")
        public String layer;

        // 图层信息
        @NameInMap("List")
        public java.util.List<GetBimStandardPlanResponseBodyDatasConfigMapInfoList> list;

        public static GetBimStandardPlanResponseBodyDatasConfigMapInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBimStandardPlanResponseBodyDatasConfigMapInfo self = new GetBimStandardPlanResponseBodyDatasConfigMapInfo();
            return TeaModel.build(map, self);
        }

        public GetBimStandardPlanResponseBodyDatasConfigMapInfo setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public GetBimStandardPlanResponseBodyDatasConfigMapInfo setList(java.util.List<GetBimStandardPlanResponseBodyDatasConfigMapInfoList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetBimStandardPlanResponseBodyDatasConfigMapInfoList> getList() {
            return this.list;
        }

    }

    public static class GetBimStandardPlanResponseBodyDatasConfig extends TeaModel {
        // 标注信息id
        @NameInMap("Id")
        public Long id;

        // 图层归类信息
        @NameInMap("MapInfo")
        public java.util.List<GetBimStandardPlanResponseBodyDatasConfigMapInfo> mapInfo;

        public static GetBimStandardPlanResponseBodyDatasConfig build(java.util.Map<String, ?> map) throws Exception {
            GetBimStandardPlanResponseBodyDatasConfig self = new GetBimStandardPlanResponseBodyDatasConfig();
            return TeaModel.build(map, self);
        }

        public GetBimStandardPlanResponseBodyDatasConfig setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBimStandardPlanResponseBodyDatasConfig setMapInfo(java.util.List<GetBimStandardPlanResponseBodyDatasConfigMapInfo> mapInfo) {
            this.mapInfo = mapInfo;
            return this;
        }
        public java.util.List<GetBimStandardPlanResponseBodyDatasConfigMapInfo> getMapInfo() {
            return this.mapInfo;
        }

    }

    public static class GetBimStandardPlanResponseBodyDatasTemplateConfigMapInfoList extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static GetBimStandardPlanResponseBodyDatasTemplateConfigMapInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetBimStandardPlanResponseBodyDatasTemplateConfigMapInfoList self = new GetBimStandardPlanResponseBodyDatasTemplateConfigMapInfoList();
            return TeaModel.build(map, self);
        }

        public GetBimStandardPlanResponseBodyDatasTemplateConfigMapInfoList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBimStandardPlanResponseBodyDatasTemplateConfigMapInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetBimStandardPlanResponseBodyDatasTemplateConfigMapInfo extends TeaModel {
        // 最近一次图层名
        @NameInMap("Layer")
        public String layer;

        // 最近一次图层id
        @NameInMap("List")
        public java.util.List<GetBimStandardPlanResponseBodyDatasTemplateConfigMapInfoList> list;

        public static GetBimStandardPlanResponseBodyDatasTemplateConfigMapInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBimStandardPlanResponseBodyDatasTemplateConfigMapInfo self = new GetBimStandardPlanResponseBodyDatasTemplateConfigMapInfo();
            return TeaModel.build(map, self);
        }

        public GetBimStandardPlanResponseBodyDatasTemplateConfigMapInfo setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public GetBimStandardPlanResponseBodyDatasTemplateConfigMapInfo setList(java.util.List<GetBimStandardPlanResponseBodyDatasTemplateConfigMapInfoList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetBimStandardPlanResponseBodyDatasTemplateConfigMapInfoList> getList() {
            return this.list;
        }

    }

    public static class GetBimStandardPlanResponseBodyDatasTemplateConfig extends TeaModel {
        // 最近一次标注配置id
        @NameInMap("Id")
        public Long id;

        // 最近一次图层信息
        @NameInMap("MapInfo")
        public java.util.List<GetBimStandardPlanResponseBodyDatasTemplateConfigMapInfo> mapInfo;

        public static GetBimStandardPlanResponseBodyDatasTemplateConfig build(java.util.Map<String, ?> map) throws Exception {
            GetBimStandardPlanResponseBodyDatasTemplateConfig self = new GetBimStandardPlanResponseBodyDatasTemplateConfig();
            return TeaModel.build(map, self);
        }

        public GetBimStandardPlanResponseBodyDatasTemplateConfig setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBimStandardPlanResponseBodyDatasTemplateConfig setMapInfo(java.util.List<GetBimStandardPlanResponseBodyDatasTemplateConfigMapInfo> mapInfo) {
            this.mapInfo = mapInfo;
            return this;
        }
        public java.util.List<GetBimStandardPlanResponseBodyDatasTemplateConfigMapInfo> getMapInfo() {
            return this.mapInfo;
        }

    }

    public static class GetBimStandardPlanResponseBodyDatas extends TeaModel {
        // 标注配置信息
        @NameInMap("Config")
        public GetBimStandardPlanResponseBodyDatasConfig config;

        // 标准图纸id
        @NameInMap("Id")
        public Long id;

        // 标准图纸状态
        @NameInMap("Status")
        public Long status;

        // 最近一次标注配置
        @NameInMap("TemplateConfig")
        public GetBimStandardPlanResponseBodyDatasTemplateConfig templateConfig;

        public static GetBimStandardPlanResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            GetBimStandardPlanResponseBodyDatas self = new GetBimStandardPlanResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public GetBimStandardPlanResponseBodyDatas setConfig(GetBimStandardPlanResponseBodyDatasConfig config) {
            this.config = config;
            return this;
        }
        public GetBimStandardPlanResponseBodyDatasConfig getConfig() {
            return this.config;
        }

        public GetBimStandardPlanResponseBodyDatas setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBimStandardPlanResponseBodyDatas setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public GetBimStandardPlanResponseBodyDatas setTemplateConfig(GetBimStandardPlanResponseBodyDatasTemplateConfig templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public GetBimStandardPlanResponseBodyDatasTemplateConfig getTemplateConfig() {
            return this.templateConfig;
        }

    }

}
