// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class Definition extends TeaModel {
    @NameInMap("Cedar")
    public DefinitionCedar cedar;

    public static Definition build(java.util.Map<String, ?> map) throws Exception {
        Definition self = new Definition();
        return TeaModel.build(map, self);
    }

    public Definition setCedar(DefinitionCedar cedar) {
        this.cedar = cedar;
        return this;
    }
    public DefinitionCedar getCedar() {
        return this.cedar;
    }

    public static class DefinitionCedar extends TeaModel {
        @NameInMap("Statement")
        public String statement;

        public static DefinitionCedar build(java.util.Map<String, ?> map) throws Exception {
            DefinitionCedar self = new DefinitionCedar();
            return TeaModel.build(map, self);
        }

        public DefinitionCedar setStatement(String statement) {
            this.statement = statement;
            return this;
        }
        public String getStatement() {
            return this.statement;
        }

    }

}
