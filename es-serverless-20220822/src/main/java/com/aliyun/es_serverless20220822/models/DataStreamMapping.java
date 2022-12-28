// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20220822.models;

import com.aliyun.tea.*;

public class DataStreamMapping extends TeaModel {
    @NameInMap("caseSensitive")
    public Boolean caseSensitive;

    @NameInMap("docValues")
    public Boolean docValues;

    @NameInMap("index")
    public Boolean index;

    @NameInMap("key")
    public String key;

    @NameInMap("properties")
    public java.util.List<DataStreamMapping> properties;

    @NameInMap("tokenizeOnChars")
    public java.util.List<String> tokenizeOnChars;

    @NameInMap("type")
    public String type;

    public static DataStreamMapping build(java.util.Map<String, ?> map) throws Exception {
        DataStreamMapping self = new DataStreamMapping();
        return TeaModel.build(map, self);
    }

    public DataStreamMapping setCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        return this;
    }
    public Boolean getCaseSensitive() {
        return this.caseSensitive;
    }

    public DataStreamMapping setDocValues(Boolean docValues) {
        this.docValues = docValues;
        return this;
    }
    public Boolean getDocValues() {
        return this.docValues;
    }

    public DataStreamMapping setIndex(Boolean index) {
        this.index = index;
        return this;
    }
    public Boolean getIndex() {
        return this.index;
    }

    public DataStreamMapping setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DataStreamMapping setProperties(java.util.List<DataStreamMapping> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.List<DataStreamMapping> getProperties() {
        return this.properties;
    }

    public DataStreamMapping setTokenizeOnChars(java.util.List<String> tokenizeOnChars) {
        this.tokenizeOnChars = tokenizeOnChars;
        return this;
    }
    public java.util.List<String> getTokenizeOnChars() {
        return this.tokenizeOnChars;
    }

    public DataStreamMapping setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
