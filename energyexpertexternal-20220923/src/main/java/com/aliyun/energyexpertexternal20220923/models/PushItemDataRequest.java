// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class PushItemDataRequest extends TeaModel {
    /**
     * <p>The enterprise code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>C-20210223-01</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>List of data to be pushed.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("items")
    public PushItemDataRequestItems items;

    /**
     * <p>The year of the data created.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024</p>
     */
    @NameInMap("year")
    public String year;

    public static PushItemDataRequest build(java.util.Map<String, ?> map) throws Exception {
        PushItemDataRequest self = new PushItemDataRequest();
        return TeaModel.build(map, self);
    }

    public PushItemDataRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PushItemDataRequest setItems(PushItemDataRequestItems items) {
        this.items = items;
        return this;
    }
    public PushItemDataRequestItems getItems() {
        return this.items;
    }

    public PushItemDataRequest setYear(String year) {
        this.year = year;
        return this;
    }
    public String getYear() {
        return this.year;
    }

    public static class PushItemDataRequestItems extends TeaModel {
        /**
         * <p>API data identification.&lt;props=&quot;intl&quot;&gt;For details: <a href="https://www.alibabacloud.com/help/en/energy-expert/developer-reference/api-energyexpertexternal-2022-09-23-getdataitemlist">GetDataItemList </a></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo_api_code</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The month.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("month")
        public String month;

        /**
         * <p>The value of the data item.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.11</p>
         */
        @NameInMap("value")
        public Double value;

        public static PushItemDataRequestItems build(java.util.Map<String, ?> map) throws Exception {
            PushItemDataRequestItems self = new PushItemDataRequestItems();
            return TeaModel.build(map, self);
        }

        public PushItemDataRequestItems setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public PushItemDataRequestItems setMonth(String month) {
            this.month = month;
            return this;
        }
        public String getMonth() {
            return this.month;
        }

        public PushItemDataRequestItems setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

}
