// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDictsRequest extends TeaModel {
    /**
     * <p>The type of the dictionary. Valid values:</p>
     * <ul>
     * <li>IK: IK dictionary after a standard update</li>
     * <li>IK_HOT: IK dictionary after a rolling update</li>
     * <li>SYNONYMS: synonym dictionary</li>
     * <li>ALIWS: Alibaba Cloud dictionary</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IK</p>
     */
    @NameInMap("analyzerType")
    public String analyzerType;

    /**
     * <p>The name of the dictionary file.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_MAIN.dic</p>
     */
    @NameInMap("name")
    public String name;

    public static ListDictsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDictsRequest self = new ListDictsRequest();
        return TeaModel.build(map, self);
    }

    public ListDictsRequest setAnalyzerType(String analyzerType) {
        this.analyzerType = analyzerType;
        return this;
    }
    public String getAnalyzerType() {
        return this.analyzerType;
    }

    public ListDictsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
