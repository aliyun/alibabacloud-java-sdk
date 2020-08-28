// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListCalcEnginesRequest extends TeaModel {
    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("Name")
    public String name;

    @NameInMap("CalcEngineType")
    @Validation(required = true)
    public String calcEngineType;

    @NameInMap("EnvType")
    public String envType;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static ListCalcEnginesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCalcEnginesRequest self = new ListCalcEnginesRequest();
        return TeaModel.build(map, self);
    }

}
