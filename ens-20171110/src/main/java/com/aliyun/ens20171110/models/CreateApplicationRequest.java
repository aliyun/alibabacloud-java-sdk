// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateApplicationRequest extends TeaModel {
    /**
     * <p>The edge application template. The value must be a JSON string that contains the following information:</p>
     * <ul>
     * <li>Basic information such as the name of the application</li>
     * <li>Information such as resource specifications and network security configurations</li>
     * <li>Service specifications</li>
     * <li>Required resources</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;appMetaData\&quot;:{        \&quot;appName\&quot;:\&quot;nginx\&quot;,        \&quot;clusterName\&quot;:\&quot;poc\&quot;,        \&quot;appType\&quot;:\&quot;Common\&quot;,        \&quot;description\&quot;:\&quot;test\&quot;    },    \&quot;resourceAttribute\&quot;:{        \&quot;resourceType\&quot;:\&quot;\&quot;,        \&quot;instanceSpec\&quot;:\&quot;ens.sn1.tiny\&quot;,        \&quot;systemDiskSize\&quot;:20,        \&quot;dataDiskSize\&quot;:0,        \&quot;bandwithOut\&quot;:10,        \&quot;areaLevel\&quot;:\&quot;National\&quot;,        \&quot;netSecurityStrategy\&quot;:null,        \&quot;initConfig\&quot;:null    },    \&quot;resourceSelector\&quot;:[        {            \&quot;count\&quot;:1        }    ],    \&quot;workload\&quot;:[        {            \&quot;podCount\&quot;:1,            \&quot;serviceConfig\&quot;:null,            \&quot;name\&quot;:\&quot;nginx\&quot;,            \&quot;podSpec\&quot;:{                \&quot;containers\&quot;:[                    {                        \&quot;name\&quot;:\&quot;android\&quot;,                        \&quot;image\&quot;:\&quot;edge-registry.alicdn.com/test/nginx\&quot;                    }                ]            },            \&quot;count\&quot;:1        }    ]}</p>
     */
    @NameInMap("Template")
    public String template;

    /**
     * <p>The timeout period for asynchronous processing. Unit: seconds. Default value: 1800.</p>
     * 
     * <strong>example:</strong>
     * <p>1800</p>
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
