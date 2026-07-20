// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListPartitionsByNamesRequest extends TeaModel {
    /**
     * <p>The list of partition specifications.</p>
     */
    @NameInMap("specs")
    public java.util.List<java.util.Map<String, String>> specs;

    public static ListPartitionsByNamesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPartitionsByNamesRequest self = new ListPartitionsByNamesRequest();
        return TeaModel.build(map, self);
    }

    public ListPartitionsByNamesRequest setSpecs(java.util.List<java.util.Map<String, String>> specs) {
        this.specs = specs;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getSpecs() {
        return this.specs;
    }

}
