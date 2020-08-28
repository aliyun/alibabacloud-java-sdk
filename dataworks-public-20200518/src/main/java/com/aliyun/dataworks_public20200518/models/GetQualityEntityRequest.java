// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetQualityEntityRequest extends TeaModel {
    @NameInMap("ProjectName")
    @Validation(required = true)
    public String projectName;

    @NameInMap("TableName")
    @Validation(required = true)
    public String tableName;

    @NameInMap("EnvType")
    @Validation(required = true)
    public String envType;

    @NameInMap("MatchExpression")
    public String matchExpression;

    public static GetQualityEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQualityEntityRequest self = new GetQualityEntityRequest();
        return TeaModel.build(map, self);
    }

}
