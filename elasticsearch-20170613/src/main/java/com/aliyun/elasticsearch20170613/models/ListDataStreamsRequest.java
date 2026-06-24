// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDataStreamsRequest extends TeaModel {
    /**
     * <p>Specifies whether to display only managed indexes. Valid values:</p>
     * <ul>
     * <li><p>true: displays only managed indexes.</p>
     * </li>
     * <li><p>false (default): displays all indexes.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("isManaged")
    public Boolean isManaged;

    /**
     * <p>The data stream name.</p>
     * 
     * <strong>example:</strong>
     * <p>Log1</p>
     */
    @NameInMap("name")
    public String name;

    public static ListDataStreamsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataStreamsRequest self = new ListDataStreamsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataStreamsRequest setIsManaged(Boolean isManaged) {
        this.isManaged = isManaged;
        return this;
    }
    public Boolean getIsManaged() {
        return this.isManaged;
    }

    public ListDataStreamsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
