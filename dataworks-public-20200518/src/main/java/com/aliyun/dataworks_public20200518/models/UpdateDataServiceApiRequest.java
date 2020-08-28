// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateDataServiceApiRequest extends TeaModel {
    @NameInMap("TenantId")
    @Validation(required = true)
    public Long tenantId;

    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("ApiId")
    @Validation(required = true)
    public Long apiId;

    @NameInMap("RequestMethod")
    @Validation(required = true)
    public Integer requestMethod;

    @NameInMap("ResponseContentType")
    @Validation(required = true)
    public Integer responseContentType;

    @NameInMap("Timeout")
    @Validation(required = true)
    public Integer timeout;

    @NameInMap("VisibleRange")
    @Validation(required = true)
    public Integer visibleRange;

    @NameInMap("Protocols")
    @Validation(required = true)
    public String protocols;

    @NameInMap("WizardDetails")
    public String wizardDetails;

    @NameInMap("ScriptDetails")
    public String scriptDetails;

    @NameInMap("RegistrationDetails")
    public String registrationDetails;

    @NameInMap("ApiPath")
    @Validation(required = true)
    public String apiPath;

    @NameInMap("ApiDescription")
    @Validation(required = true)
    public String apiDescription;

    public static UpdateDataServiceApiRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataServiceApiRequest self = new UpdateDataServiceApiRequest();
        return TeaModel.build(map, self);
    }

}
