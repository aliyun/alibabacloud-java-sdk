// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UpgradeApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a2bac6f4-75dc-455e-8389-2dc8e47526d3</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The information template for phased update. The value must be a JSON string and contain the following information:</p>
     * <ul>
     * <li>Version range that you want to update</li>
     * <li>Configuration information of the target version</li>
     * <li>Canary release policy for resources</li>
     * <li>Intelligent upgrade policy that contains information such as the time window and resource usage limit</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;fromAppVersions\&quot;:{        \&quot;operator\&quot;:\&quot;In\&quot;,        \&quot;values\&quot;:[            \&quot;v1\&quot;,            \&quot;v2\&quot;        ]    },    \&quot;toAppVersion\&quot;:\&quot;v3\&quot;,    \&quot;descrip\&quot;:\&quot;xxx\&quot;,    \&quot;workload\&quot;:[        {            \&quot;name\&quot;:\&quot;nginx\&quot;,            \&quot;podSpec\&quot;:{            }        }    ],    \&quot;upgradeStrategy\&quot;:{        \&quot;name\&quot;:\&quot;ScheduleToISP\&quot;,        \&quot;parameters\&quot;:{            \&quot;operator\&quot;:\&quot;In\&quot;,            \&quot;values\&quot;:[                \&quot;telecom\&quot;            ]        }    },    \&quot;autoUpgradeStrategy\&quot;:{        \&quot;name\&quot;:\&quot;AdjustToPodUsage\&quot;,        \&quot;checkInterval\&quot;:600,        \&quot;startTime\&quot;:\&quot;2021-02-19 00:00:00\&quot;,        \&quot;startHourPoint\&quot;:\&quot;0\&quot;,        \&quot;endHourPoint\&quot;:\&quot;8\&quot;,        \&quot;endTime\&quot;:\&quot;2021-02-19 08:00:00\&quot;,        \&quot;level\&quot;:\&quot;RegionId\&quot;,        \&quot;rules\&quot;:[            {                \&quot;regionCodes\&quot;:[                    \&quot;cn-wuxi-telecom_unicom_cmcc\&quot;,                    \&quot;cn-shijiazhuang-telecom_unicom_cmcc\&quot;                ],                \&quot;usageRatioLimit\&quot;:{                    \&quot;maxPodUsageRatio\&quot;:50                },                \&quot;maxUpgradingRatio\&quot;:50            },            {                \&quot;regionCodes\&quot;:[                    \&quot;cn-wuhan-telecom_unicom_cmcc\&quot;                ],                \&quot;usageRatioLimit\&quot;:{                    \&quot;maxPodUsageRatio\&quot;:30                },                \&quot;maxUpgradingRatio\&quot;:20            },            {                \&quot;regionCodes\&quot;:[                    \&quot;All\&quot;                ],                \&quot;usageRatioLimit\&quot;:{                    \&quot;maxPodUsageRatio\&quot;:20                },                \&quot;maxUpgradingRatio\&quot;:50,                \&quot;maxUpgradingCount\&quot;:2            }        ]    }}</p>
     */
    @NameInMap("Template")
    public String template;

    /**
     * <p>The timeout period for asynchronous upgrade. Unit: seconds. Default value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>1800</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    public static UpgradeApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeApplicationRequest self = new UpgradeApplicationRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpgradeApplicationRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public UpgradeApplicationRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
