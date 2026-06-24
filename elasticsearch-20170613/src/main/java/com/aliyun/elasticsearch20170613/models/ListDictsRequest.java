// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDictsRequest extends TeaModel {
    /**
     * <p>The dictionary type. Valid values:</p>
     * <ul>
     * <li><p>IK: IK cold update dictionary.</p>
     * </li>
     * <li><p>IK_HOT: IK hot update dictionary.</p>
     * </li>
     * <li><p>SYNONYMS: Synonym dictionary.</p>
     * </li>
     * <li><p>ALIWS: Alibaba dictionary.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IK</p>
     */
    @NameInMap("analyzerType")
    public String analyzerType;

    /**
     * <p>The name of the file to filter.</p>
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
