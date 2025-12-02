// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateImageLibRequest extends TeaModel {
    /**
     * <p>Comment information for the library.</p>
     * 
     * <strong>example:</strong>
     * <p>备注</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>Exemption from review configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FreeInspection")
    public Integer freeInspection;

    /**
     * <p>Library ID.</p>
     * 
     * <strong>example:</strong>
     * <p>custom_xxxx</p>
     */
    @NameInMap("LibId")
    public String libId;

    /**
     * <p>Library name.</p>
     * 
     * <strong>example:</strong>
     * <p>测试图库</p>
     */
    @NameInMap("LibName")
    public String libName;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateImageLibRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageLibRequest self = new UpdateImageLibRequest();
        return TeaModel.build(map, self);
    }

    public UpdateImageLibRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public UpdateImageLibRequest setFreeInspection(Integer freeInspection) {
        this.freeInspection = freeInspection;
        return this;
    }
    public Integer getFreeInspection() {
        return this.freeInspection;
    }

    public UpdateImageLibRequest setLibId(String libId) {
        this.libId = libId;
        return this;
    }
    public String getLibId() {
        return this.libId;
    }

    public UpdateImageLibRequest setLibName(String libName) {
        this.libName = libName;
        return this;
    }
    public String getLibName() {
        return this.libName;
    }

    public UpdateImageLibRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
