// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class EditRoutineConfRequest extends TeaModel {
    /**
     * <p>The configurations of the specified environment.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.</p>
     */
    @NameInMap("EnvConf")
    public java.util.Map<String, ?> envConf;

    /**
     * <p>> </p>
     * <p>*   This operation modifies only the specified configurations. Other configurations remain unchanged.</p>
     * <p>*   If you want to delete a setting, delete the parameter value.</p>
     * <p>*   This operation can add canary release environments. Make sure that the environment names comply with the naming rules. Otherwise, you will fail to add the environments.</p>
     * <p>*   Dynamic Route for CDN (DCDN) provides 35 canary release environments. Among these environments, 34 are deployed in China and 1 is deployed outside China. The canary release environments are:</p>
     * <p>    *   Outside China: presetCanaryOverseas.</p>
     * <p>    *   In China: The 34 canary release environments are named in the format of presetCanaryXX. For example, presetCanaryBeijing represents the canary release environment in Beijing. A canary release environment is in each of the following regions: Anhui, Beijing, Chongqing, Fujian, Gansu, Guangdong, Guangxi, Guizhou, Hainan, Hebei, Heilongjiang, Henan, Hong Kong, Hubei, Hunan, Jiangsu, Jiangxi, Jilin, Liaoning, Macao, Neimenggu, Ningxia, Qinghai, Shaanxi, Shandong, Shanghai, Shanxi, Sichuan, Taiwan, Tianjin, Xinjiang, Xizang, Yunan, and Zhejiang.</p>
     * <p>*   You can call this operation up to 100 times per second per account.</p>
     */
    @NameInMap("Name")
    public String name;

    public static EditRoutineConfRequest build(java.util.Map<String, ?> map) throws Exception {
        EditRoutineConfRequest self = new EditRoutineConfRequest();
        return TeaModel.build(map, self);
    }

    public EditRoutineConfRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public EditRoutineConfRequest setEnvConf(java.util.Map<String, ?> envConf) {
        this.envConf = envConf;
        return this;
    }
    public java.util.Map<String, ?> getEnvConf() {
        return this.envConf;
    }

    public EditRoutineConfRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
