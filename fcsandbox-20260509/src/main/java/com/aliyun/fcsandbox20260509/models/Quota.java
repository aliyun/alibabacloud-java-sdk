// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class Quota extends TeaModel {
    /**
     * <p>The vCPU quota limit. Unit: cores.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("cpuCores")
    public Integer cpuCores;

    /**
     * <p>The memory quota limit. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>64</p>
     */
    @NameInMap("memoryGB")
    public Integer memoryGB;

    /**
     * <p>Team ID</p>
     * 
     * <strong>example:</strong>
     * <p>f79d6a95-abcd-47a8-9167-eccf0622a998</p>
     */
    @NameInMap("tagValue")
    public String tagValue;

    public static Quota build(java.util.Map<String, ?> map) throws Exception {
        Quota self = new Quota();
        return TeaModel.build(map, self);
    }

    public Quota setCpuCores(Integer cpuCores) {
        this.cpuCores = cpuCores;
        return this;
    }
    public Integer getCpuCores() {
        return this.cpuCores;
    }

    public Quota setMemoryGB(Integer memoryGB) {
        this.memoryGB = memoryGB;
        return this;
    }
    public Integer getMemoryGB() {
        return this.memoryGB;
    }

    public Quota setTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }
    public String getTagValue() {
        return this.tagValue;
    }

}
