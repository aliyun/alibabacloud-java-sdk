// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateQualityEntityRequest extends TeaModel {
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
    @Validation(required = true)
    public String matchExpression;

    @NameInMap("EntityLevel")
    @Validation(required = true)
    public Integer entityLevel;

    public static CreateQualityEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQualityEntityRequest self = new CreateQualityEntityRequest();
        return TeaModel.build(map, self);
    }

}
