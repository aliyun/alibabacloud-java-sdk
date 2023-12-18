// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateApplicationRequest extends TeaModel {
    /**
     * <p>The edge application template. The value must be a JSON string that contains the following information:</p>
     * <br>
     * <p>*   Basic information such as the name of the application</p>
     * <p>*   Information such as resource specifications and network security configurations</p>
     * <p>*   Service specifications</p>
     * <p>*   Required resources</p>
     */
    @NameInMap("Template")
    public String template;

    /**
     * <p>The timeout period for asynchronous processing. Unit: seconds. Default value: 1800.</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    public static CreateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationRequest self = new CreateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public CreateApplicationRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
