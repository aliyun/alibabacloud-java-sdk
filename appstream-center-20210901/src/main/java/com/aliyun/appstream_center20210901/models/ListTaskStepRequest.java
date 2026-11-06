// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListTaskStepRequest extends TeaModel {
    /**
     * <p>The task type to which the step belongs. Valid values:</p>
     * <ul>
     * <li><strong>ADAPTOR</strong>: Application adaptation steps.</li>
     * <li><strong>IMAGE</strong>: Image creation steps.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IMAGE</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListTaskStepRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskStepRequest self = new ListTaskStepRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskStepRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
