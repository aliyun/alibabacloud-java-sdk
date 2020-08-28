// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListCalcEnginesResponse extends TeaModel {
    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListCalcEnginesResponseData data;

    public static ListCalcEnginesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCalcEnginesResponse self = new ListCalcEnginesResponse();
        return TeaModel.build(map, self);
    }

    public static class ListCalcEnginesResponseDataCalcEngines extends TeaModel {
        @NameInMap("CalcEngineType")
        @Validation(required = true)
        public String calcEngineType;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("DwRegion")
        @Validation(required = true)
        public String dwRegion;

        @NameInMap("IsDefault")
        @Validation(required = true)
        public Boolean isDefault;

        @NameInMap("BindingProjectId")
        @Validation(required = true)
        public Integer bindingProjectId;

        @NameInMap("EnvType")
        @Validation(required = true)
        public String envType;

        @NameInMap("TenantId")
        @Validation(required = true)
        public Long tenantId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("BindingProjectName")
        @Validation(required = true)
        public String bindingProjectName;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("EngineId")
        @Validation(required = true)
        public Integer engineId;

        @NameInMap("EngineInfo")
        @Validation(required = true)
        public java.util.Map<String, ?> engineInfo;

        @NameInMap("TaskAuthType")
        @Validation(required = true)
        public String taskAuthType;

        public static ListCalcEnginesResponseDataCalcEngines build(java.util.Map<String, ?> map) throws Exception {
            ListCalcEnginesResponseDataCalcEngines self = new ListCalcEnginesResponseDataCalcEngines();
            return TeaModel.build(map, self);
        }

    }

    public static class ListCalcEnginesResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("CalcEngines")
        @Validation(required = true)
        public java.util.List<ListCalcEnginesResponseDataCalcEngines> calcEngines;

        public static ListCalcEnginesResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListCalcEnginesResponseData self = new ListCalcEnginesResponseData();
            return TeaModel.build(map, self);
        }

    }

}
