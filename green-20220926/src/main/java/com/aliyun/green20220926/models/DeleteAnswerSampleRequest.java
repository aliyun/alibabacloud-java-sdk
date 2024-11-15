// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class DeleteAnswerSampleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[15463605]</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <strong>example:</strong>
     * <p>alxxx</p>
     */
    @NameInMap("LibId")
    public String libId;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteAnswerSampleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAnswerSampleRequest self = new DeleteAnswerSampleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAnswerSampleRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public DeleteAnswerSampleRequest setLibId(String libId) {
        this.libId = libId;
        return this;
    }
    public String getLibId() {
        return this.libId;
    }

    public DeleteAnswerSampleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
